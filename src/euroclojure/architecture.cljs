(ns euroclojure.architecture
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.left
   [:h2 "Architecture"]
   [:ul
    [:li "Rails App " icons/right-arrow " Rails API (backend) + ClojureScript App (frontend)"]
    [:li [:b "Libraries: "]
     "re-frame (and reagent), tower, kioo, honeybadger"]
    [:li [:b "Hosting: "]
     "AWS S3 + Cloudfront (for SSL)"]
    [:li [:b "Tooling: "]
     "lein, figwheel, lein-doo, phantomjs, browser-sync, gulp, npm, bower, webpack, sass..."]]
   [:h3 {:style {:text-align "center"}}
    [:em " A lot of tooling to setup! "]]])
