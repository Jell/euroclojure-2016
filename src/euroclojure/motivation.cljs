(ns euroclojure.motivation
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.left
   [:h2 "Origins"]
   [:ul
    [:li icons/cold-sweat " know nothing about (modern) front-end"]
    [:li icons/expressionless " JavaScript semantics"]
    [:li icons/heart " Clojure semantics"]]

   [:h2 "Constraints"]
   [:ul
    [:li icons/strong " Designers need to be empowered"]
    [:li icons/computer " Programmers should not need Emacs"]
    [:li icons/monorail " Do everything Rails does"]]])
