(ns euroclojure.solution-3-tradeoffs)

(defn slide [context]
  [:div.slide.left
   [:h2 "Solution 3: Trade-offs"]
   [:h3 "Pros:"]
   [:ul
    [:li "Designers can use React libraries directly"]
    [:li "Modular, reusable components"]]
   [:h3 "Cons:"]
   [:ul
    [:li "A lot more tooling and glue needed"]
    [:li "Designers need to write templates in JSX"]
    [:li "JavaScript knowledge required for designers"]]
   [:h3 "Common language: JavaScript / JSX templates"]])
