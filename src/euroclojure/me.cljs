(ns euroclojure.me
  (:require-macros [euroclojure.inline :refer [img]])
  (:require [euroclojure.icons :as icons]))

(defn slide [context]
  [:div.slide.centered
   [:h2 "Hello!"]
   (img {:src "images/shining.png" :height "300px"})
   [:div icons/sweden " from Göteborg, Sweden " icons/sweden]
   [:div icons/heart " Clojure " icons/heart ]
   [:div "Organizer of "
    [:a {:href "https://www.meetup.com/got-lambda/"
         :target "_blank"} "Got.λ"]]])
