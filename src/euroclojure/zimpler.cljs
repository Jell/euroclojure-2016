(ns euroclojure.zimpler)

(defn slide []
  [:div.centered.large-text
   [:img {:src "/images/zimpler.png" :height "100px"}]
   [:br]
   [:img {:src "/images/team.jpg?v2" :height "300px"}]
   [:ul
    [:li "Sweden (Göteborg & Stockholm)"]
    [:li "Founded in 2012"]
    [:li "27 employees"]
    [:li "Mobile Payment"]]])
