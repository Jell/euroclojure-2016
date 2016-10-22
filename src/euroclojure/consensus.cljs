(ns euroclojure.consensus)

(defn slide [context]
  [:div.slide.left
   [:h1.centered "Consensus first!"]
   [:ul
    [:li "Everyone needs to be onboard"]
    [:li "Try to stay objective as much as possible"]
    [:li "Take time to communicate motivation"]]
   [:h3 {:style {:text-align "center"}}
   [:em "new tool = first blame"]]])
