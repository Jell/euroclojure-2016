(ns euroclojure.designers
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.left
   [:h1 "Working with Designers"]
   [:ul
    [:li [:b "Profile 1:"] " " icons/heart-with-ribbon " PhotoShop"]
    [:li [:b "Profile 2:"] " " icons/heart " HTML + CSS/SASS/LESS"]
    [:li [:b "Profile 3:"] " " icons/revolving-hearts " Hands-on full-control / front-end dev"]]])
