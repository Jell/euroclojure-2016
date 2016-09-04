(ns euroclojure-cljs.core
  (:require [reagent.core :as reagent :refer [atom]]
            reagent.dom
            webpack-bundle))

(enable-console-print!)

(defonce app-state (atom {:clicked nil}))

(defn hello-world []
  [:div
   [:h1 (str "Clicked: " (:clicked @app-state))]
   [:> js/MuiThemeProvider {:muiTheme js/MuiTheme}
    [:> js/MyAwesomeReactComponent
     {:titles (map str (range 10))
      :callback (fn [title]
                  (swap! app-state assoc :clicked title))}]]])

(defonce boot
  (reagent/render-component [#'hello-world]
                            (. js/document (getElementById "app"))))

(defn on-js-reload []
  (reagent/force-update-all))
