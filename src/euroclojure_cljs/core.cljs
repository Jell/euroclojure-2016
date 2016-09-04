(ns euroclojure-cljs.core
  (:require [reagent.core :as reagent :refer [atom]]
            reagent.dom
            webpack-bundle))

(enable-console-print!)

(defonce app-state (atom {:text "Hello world!"}))

(defn hello-world []
  [:> js/MuiThemeProvider {:muiTheme js/MuiTheme}
   [:> js/MyAwesomeReactComponent
    {:titles (map str (range 10))
     :callback (fn [title] (js/alert (str "clicked JS: " title)))
     :others {}}]])

(defonce boot
  (reagent/render-component [hello-world]
                            (. js/document (getElementById "app"))))

(defn on-js-reload []
  (reagent/force-update-all))
