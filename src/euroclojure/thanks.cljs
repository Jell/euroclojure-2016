(ns euroclojure.thanks)

(defn slide [{:keys [speaker]}]
  [:div.slide.centered
   [:h1 "Thank you!"]
   [:ul
    [:li "Lynn Grogan for the logistics"]
    [:li "Michał Marczyk for taking the time to mentor me"]
    [:li "Zimpler colleagues for this awesome journey"]]])
