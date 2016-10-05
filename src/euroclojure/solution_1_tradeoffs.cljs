(ns euroclojure.solution-1-tradeoffs)

(defn slide [context]
  [:div.slide.left
   [:h2 "Solution 1: Trade-offs"]
   [:h3 "Pros:"]
   [:ul
    [:li "Minimal tooling"]
    [:li "Pure ClojureScript, known abstraction"]]
   [:h3 "Cons:"]
   [:ul
    [:li "All implementation done by developpers"]]
   [:h3 "Common language: visual sketches"]])
