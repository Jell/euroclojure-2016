(ns euroclojure.architecture)

(defn slide []
  [:div.slide-padding.large-text
   [:h2 "Architecture"]
   [:ul
    [:li "Rails App \u2192 Rails API + ClojureScript App"]
    [:li [:b "Libraries: "]
     "re-frame (and reagent), tower, kioo, honeybadger"]
    [:li [:b "Tooling: "]
     "lein, figwheel, lein-doo, phantomjs, browser-sync, gulp, npm, bower, webpack, sass..."]]
   [:em.centered "A lot of tooling to setup!"]])
