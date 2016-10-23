(ns euroclojure.motivation
  (:require [euroclojure.icons :as icons]))

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "But not happy"]
   [:ul
    [:li "Painful to add new features"]
    [:li "Braided flow, state and view logic"]
    (when speaker
      [:div "checkout = step-through wizard with lots of branching,
      which is not easy in idiomatic Rails"])
    [:li "Slow tests"]
    [:li "Devs are the bottleneck to any change"]
    (when speaker
      [:div "in particular, if designers want to make a small visual changes, they had to go through a developper"])]])
