(ns euroclojure.core
  (:require-macros [euroclojure.inline :refer [inline-file]])
  (:require [reagent.core :as reagent]
            reagent.dom
            [euroclojure.me :as me]
            [euroclojure.zimpler :as zimpler]
            [euroclojure.demo :as demo]
            [euroclojure.architecture :as architecture]
            [euroclojure.designers :as designers]
            [euroclojure.motivation :as motivation]
            [euroclojure.meta-meta :as meta-meta]
            [euroclojure.meta-macro :as meta-macro]
            [euroclojure.solution-1 :as solution-1]
            [euroclojure.solution-2 :as solution-2]
            [euroclojure.solution-3 :as solution-3]
            webpack-bundle))

(enable-console-print!)

(defonce app-state
  (reagent/atom {:slide-index 0
                 :transition "forward"}))

(def slides [me/slide
             zimpler/slide
             demo/slide
             architecture/slide
             motivation/slide
             meta-meta/slide
             designers/slide
             solution-1/slide
             solution-2/slide
             solution-3/slide
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
      [controls slide-index]
      [slide-transition {:transition-name transition
                         :index slide-index}
       [(nth slides slide-index)]]]]))

(defn the-end []
  [:div.slide.centered
   [:h1 "The end"]])

(defn speaker-view []
  (let [slides-plus-end (conj slides the-end)
        {:keys [slide-index]} @app-state]
    [theme
     [:div
      [:div {:style {:width "530px"
                     :height "650px"
                     :padding 0
                     :margin "30px"
                     :display "block"
                     :border "1px solid"
                     :float "left"}}
       [(nth slides slide-index)
        {:speaker true}]]
      [:div {:style {:width "530px"
                     :height "650px"
                     :padding 0
                     :margin "30px"
                     :display "block"
                     :border "1px solid"
                     :float "right"}}
       [(nth slides-plus-end (inc slide-index))
        {:speaker true}]]]]))

(defn- make-popup-div []
  (when-let [new-window (.open js/window ""
                               "Euroclojure Speaker View"
                               "width=1200, height=900")]
    (let [document (.-document new-window)
          body (.-body document)]
      ;; Need to reset the body to not confuse react
      (set! (.-innerHTML body)
            (inline-file "resources/public/speaker.html"))
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
  (reagent/render-component [#'layout]
                            (. js/document (getElementById "app"))))

(defn on-js-reload []
  (popup-speaker-view)
  (reagent/force-update-all))
