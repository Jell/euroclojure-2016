(ns euroclojure.zimpler)

(defn slide []
  [:div.slide.centered
   [:img {:src "images/zimpler.png" :height "100px"}]
   [:br]
   [:img {:src "images/team.jpg" :height "300px"}]
   [:ul
    [:li "Sweden (Göteborg & Stockholm)"]
    [:li "Founded in 2012"]
    [:li "27 employees"]
    [:li "Mobile Payment"]]])
