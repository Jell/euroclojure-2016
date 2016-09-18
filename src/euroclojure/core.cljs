(ns euroclojure.core
  (:require [reagent.core :as reagent]
            reagent.dom
            [euroclojure.me :as me]
            [euroclojure.zimpler :as zimpler]
            [euroclojure.demo :as demo]
            [euroclojure.architecture :as architecture]
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

(def slides [#'me/slide
             #'zimpler/slide
             #'demo/slide
             #'architecture/slide
             #'meta-meta/slide
             #'solution-1/slide
             #'solution-2/slide
             #'solution-3/slide
             #'meta-macro/slide])

(defn next-slide []
  (swap! app-state assoc :transition "forward")
  (swap! app-state update :slide-index inc))

(defn previous-slide []
  (swap! app-state assoc :transition "backward")
  (swap! app-state update :slide-index dec))

(defn on-key-down [e]
  (let [{:keys [slide-index]} @app-state]
    (case (.-keyCode e)
      37 (when (< 0 slide-index)
           (previous-slide))
      39 (when (> (count slides) (inc slide-index))
           (next-slide))
      :skip)))

(defn stepper-component [slide-index]
  [:> js/Stepper {:activeStep slide-index
                  :style {:width "90%"
                          :float "left"
                          :height "30px"}}
   (map-indexed (fn [index slide]
                  ^{:key index}
                  [:> js/Step
                   [:> js/StepLabel ""]])
                slides)])

(defn layout []
  (let [{:keys [slide-index transition]} @app-state]
    [:> js/MuiThemeProvider {:muiTheme js/MuiTheme}
     [:div
      [:div {:class "controls"}
       [:button (if (< 0 slide-index)
                  {:on-click previous-slide}
                  {:disabled true})
        "<"]
       [stepper-component slide-index]
       [:button (if (> (count slides) (inc slide-index))
                  {:on-click next-slide}
                  {:disabled true})
        ">"]]
      [:> js/React.addons.CSSTransitionGroup
       {:component "div"
        :className "slide-transition"
        :transitionName transition
        :transitionEnter true
        :transitionLeave true
        :transitionEnterTimeout 600
        :transitionLeaveTimeout 600}
       ^{:key slide-index}
       [:div {:class (str "slide slide-" (inc slide-index))}
        [(nth slides slide-index)]]]]]))

(defn ^:export start []
  (set! (.-onkeydown js/document) on-key-down)
  (reagent/render-component [#'layout]
                            (. js/document (getElementById "app"))))

(defn on-js-reload []
  (reagent/force-update-all))
