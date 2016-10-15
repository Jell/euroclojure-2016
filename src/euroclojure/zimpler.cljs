(ns euroclojure.zimpler
  (:require-macros [euroclojure.inline :refer [img]])
  (:require [euroclojure.icons :as icons]))

(defn slide [context]
  [:div.slide.centered
   (img {:src "images/zimpler.png" :height "100px"})
   [:br]
   (img {:src "images/team.jpg"
         :height "250px"
         :style {:max-width "100%"}})
   [:ul
    [:li "Sweden (Göteborg & Stockholm)"]
    [:li "Founded in 2012"]
    [:li "27 employees (7 devs, 2 designers)"]
    [:li "Mobile Payment"]]])
