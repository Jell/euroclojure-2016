(ns euroclojure.motivation
  (:require [euroclojure.icons :as icons]))

(defn slide []
  [:div.slide.left
   [:h2 "Origins"]
   [:ol {:type "1"}
    [:li icons/cold-sweat " know nothing about (modern) front-end"]
    [:li icons/heart " Clojure semantics"]
    [:li icons/expressionless " JavaScript semantics"]]])
