(ns euroclojure.what-kind-of-app)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "What was our plan?"]
   [:ul
    [:li "Break out all View and Flow logic to a separate Single Page Application"]
    [:li "Turn existing Rails app into pure JSON REST API"]]])
