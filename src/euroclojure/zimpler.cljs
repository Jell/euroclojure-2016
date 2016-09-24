(ns euroclojure.zimpler
  (:require-macros [euroclojure.inline :refer [img]])
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.centered
   (img {:src "images/zimpler.png" :height "100px"})
   [:br]
   (img {:src "images/team.jpg"
         :height "250px"
         :style {:max-width "100%"}})
   [:ul
    [:li
     icons/sweden
     " Sweden (Göteborg & Stockholm) "
     icons/sweden]
    [:li
     icons/rocket
     " Founded in 2012 "
     icons/rocket]
    [:li
     icons/holding-hands-1
     icons/holding-hands-2
     " 27 employees "
     icons/holding-hands-3
     icons/holding-hands-1]
    [:li
     icons/money-with-wings
     " Mobile Payment "
     icons/money-with-wings]]])
