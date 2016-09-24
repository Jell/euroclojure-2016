(ns euroclojure.me
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.centered
   [:h2 "Hello!"]
   [:img {:src "images/shining.png" :height "300px"}]
   [:div "from Göteborg, Sweden"]
   [:div icons/heart "Clojure" icons/heart ]
   [:div "Organizer of "
    [:a {:href "https://www.meetup.com/got-lambda/"} "Got.λ"]]])
