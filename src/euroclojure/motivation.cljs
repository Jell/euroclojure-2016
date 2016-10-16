(ns euroclojure.motivation
  (:require [euroclojure.icons :as icons]))

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h2 "Goal: New checkout Application"]
   [:h3 "Existing pain-points with Rails apps"]
   [:ul
    [:li "Braided flow, state and view logic"]
    (when speaker
      [:p "checkout = step-through wizard with lots of branching"])
    [:li "Slow tests"]
    [:li "Annoying to deal with templates and localization"]
    [:li "Devs are the bottleneck to any change"]]
   [:h3 "Constraints"]
   [:ul
    [:li "Programmers should not need Emacs"]
    (when speaker
      [:p "To be clear: shouldn't need to != should not. I use Emacs"])]])
