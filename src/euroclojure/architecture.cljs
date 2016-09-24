(ns euroclojure.architecture
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.left
   [:h2 "Architecture"]
   [:ul
    [:li "Rails App \u2192 Rails API + ClojureScript App"]
    [:li [:b "Libraries: "]
     "re-frame (and reagent), tower, kioo, honeybadger"]
    [:li [:b "Tooling: "]
     "lein, figwheel, lein-doo, phantomjs, browser-sync, gulp, npm, bower, webpack, sass..."]]
   [:h3 {:style {:text-align "center"}}
    (repeat 4 icons/screaming-in-fear)
    [:em " A lot of tooling to setup! "]
    (repeat 4 icons/screaming-in-fear)]])
