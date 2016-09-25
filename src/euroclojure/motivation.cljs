(ns euroclojure.motivation
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.left
   [:h2 "Goal: New checkout Application"]
   [:h3 "Starting point"]
   [:ul
    [:li icons/monorail " existing Rails app (backend+frontend)"]
    [:li icons/cold-sweat " know nothing about (modern) front-end"]
    [:li icons/expressionless " JavaScript semantics"]
    [:li icons/heart " Clojure semantics"]]

   [:h3 "Constraints"]
   [:ul
    [:li "Designers need to be empowered"]
    [:li "Programmers should not need Emacs"]
    [:li "Do everything Rails asset pipeline does"]]])
