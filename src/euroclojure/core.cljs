(ns euroclojure.core
  (:require-macros [euroclojure.inline :refer [inline-file]])
  (:require [reagent.core :as reagent]
            [euroclojure.bad-things :as bad-things]
            [euroclojure.conclusion :as conclusion]
            [euroclojure.consensus :as consensus]
            [euroclojure.demo :as demo]
            [euroclojure.designers :as designers]
            [euroclojure.enfocus-demo :as enfocus-demo]
            [euroclojure.feedback-loop :as feedback-loop]
            [euroclojure.future :as future]
            [euroclojure.going-live :as going-live]
            [euroclojure.good-things :as good-things]
            [euroclojure.gulp :as gulp]
            [euroclojure.hacks :as hacks]
            [euroclojure.improve :as improve]
            [euroclojure.introduction :as introduction]
            [euroclojure.jsx-demo :as jsx-demo]
            [euroclojure.kioo-demo :as kioo-demo]
            [euroclojure.localized :as localized]
            [euroclojure.meta-macro :as meta-macro]
            [euroclojure.meta-meta :as meta-meta]
            [euroclojure.motivation :as motivation]
            [euroclojure.no-details :as no-details]
            [euroclojure.prototype :as prototype]
            [euroclojure.reagent-demo :as reagent-demo]
            [euroclojure.scale :as scale]
            [euroclojure.starting :as starting]
            [euroclojure.thanks :as thanks]
            [euroclojure.tools :as tools]
            [euroclojure.what_kind_of_app :as what_kind_of_app]
            [euroclojure.zimpler :as zimpler]
            webpack-bundle))

(enable-console-print!)

(defonce app-state
  (reagent/atom {:slide-index 0
                 :transition "forward"
                 :time 0}))

(def slides [introduction/slide
             no-details/slide
             meta-meta/slide
             zimpler/slide
             scale/slide

             starting/slide
             motivation/slide
             what_kind_of_app/slide
             demo/slide

             prototype/slide
             enfocus-demo/slide
             feedback-loop/slide
             improve/slide
             reagent-demo/slide
             kioo-demo/slide
             going-live/slide
             gulp/slide
             future/slide
             jsx-demo/slide

             designers/slide
             good-things/slide
             bad-things/slide
             consensus/slide
             conclusion/slide

             thanks/slide
             localized/slide
             hacks/slide
             tools/slide
             meta-macro/slide])

(defn next-slide []
  (swap! app-state assoc :transition "forward")
  (swap! app-state update :slide-index inc))

(defn previous-slide []
  (swap! app-state assoc :transition "backward")
  (swap! app-state update :slide-index dec))

(defn slide-transition [{:keys [transition-name index]} slide]
  [:> js/React.addons.CSSTransitionGroup
   {:component "div"
    :className "slide-transition"
    :transitionName transition-name
    :transitionEnter true
    :transitionLeave true
    :transitionEnterTimeout 600
    :transitionLeaveTimeout 600}
   ^{:key index}
   [:div {:style {:width "100%"
                  :position "fixed"
                  :display "block"
                  :overflow "scroll"
                  :height (str (- js/window.innerHeight 30) "px")}}
    slide]])

(defn stepper-component [slide-index]
  [:> js/Stepper {:activeStep slide-index
                  :style {:width "90%"
                          :float "left"
                          :height "30px"}}
   (map-indexed (fn [index slide]
                  ^{:key index}
                  [:> js/Step {:style {:height "30px"
                                       :padding 0}}
                   [:> js/StepLabel {:style {:height "30px"
                                             :padding 0}}]])
                slides)])

(defn controls [slide-index]
  [:div {:class "controls"
         :style {:height "30px"}}
   [:button (if (< 0 slide-index)
              {:on-click previous-slide}
              {:disabled true})
    "<"]
   [stepper-component slide-index]
   [:button (if (> (count slides) (inc slide-index))
              {:on-click next-slide}
              {:disabled true})
    ">"]])

(defn on-key-down [e]
  (let [{:keys [slide-index]} @app-state]
    (case (.-keyCode e)
      37 (when (< 0 slide-index)
           (previous-slide))
      39 (when (> (count slides) (inc slide-index))
           (next-slide))
      :skip)))

(defn theme [child]
  [:> js/MuiThemeProvider {:muiTheme js/MuiTheme}
   child])

(defn layout []
  (let [{:keys [slide-index transition]} @app-state]
    [theme
     [:div
      [slide-transition {:transition-name transition
                         :index slide-index}
       [(nth slides slide-index) {:speaker false}]]
      [controls slide-index]]]))

(defn the-end []
  [:div.slide.centered
   [:h1 "The end"]])

(defn speaker-slide [position slide]
  [:div {:style {:width "530px"
                 :height "650px"
                 :padding 0
                 :margin "15px 30px"
                 :display "block"
                 :border "1px solid"
                 :float position}}
   [slide {:speaker true}]])

(defn clock []
  (let [{:keys [time]} @app-state
        secs (mod time 60)
        mins (quot time 60)]
    [:div {:style {:width "100%"
                   :text-align "center"
                   :color (if (>= mins 30) "red" "black")
                   :font-size "xx-large"}}
     (str (when (< mins 10) "0") mins
          ":"
          (when (< secs 10) "0") secs)]))

(defn speaker-view []
  (let [slides-plus-end (conj slides the-end)
        {:keys [slide-index]} @app-state]
    [theme
     [:div
      [stepper-component slide-index]
      [clock]
      [speaker-slide "left" (nth slides slide-index)]
      [speaker-slide "right" (nth slides-plus-end (inc slide-index))]]]))

(defn- make-popup-div []
  (when-let [new-window (.open js/window ""
                               "Euroclojure Speaker View"
                               "width=1200, height=900")]
    (let [document (.-document new-window)
          body (.-body document)]
      ;; Need to reset the body to not confuse react
      (set! (.-innerHTML body)
            (str "<style>"
                 (inline-file "resources/public/css/app.css")
                 (inline-file "resources/public/css/solarized-light.css")
                 "</style>"
                 (inline-file "resources/public/speaker.html")))
      (set! (.-onkeydown document) on-key-down)
      (.getElementById document "speaker"))))

(defn popup-speaker-view []
  (when-let [speaker-div (make-popup-div)]
    (reagent/render-component
     [#'speaker-view]
     speaker-div)))

(defn ^:export start []
  (set! (.-onkeydown js/document) on-key-down)
  (set! (.-onresize js/document.body) reagent/force-update-all)
  (popup-speaker-view)
  (js/setInterval #(swap! app-state update :time inc) 1000)
  (reagent/render-component [#'layout]
                            (. js/document (getElementById "app"))))

(defn on-js-reload []
  (popup-speaker-view)
  (reagent/force-update-all))
