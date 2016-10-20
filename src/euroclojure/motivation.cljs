(ns euroclojure.motivation
  (:require [euroclojure.icons :as icons]))

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h2 "Goal: New checkout Application"]
   [:h3 "Existing pain-points with Rails apps"]
   [:ul
    [:li "Braided flow, state and view logic"]
    (when speaker
      [:div "checkout = step-through wizard with lots of branching"])
    [:li "Slow tests"]
    [:li "Annoying to deal with templates and localization"]
    [:li "Devs are the bottleneck to any change"]]
   [:h3 "Constraints"]
   [:ul
    [:li "Acceptable barrier of entry for new designers & developers"]
    [:li "Bring your own editor (not everyone uses Emacs!)"]
    (when speaker
      [:div "To be clear: shouldn't need to != should not. I use Emacs"])]])
