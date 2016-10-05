(ns euroclojure.solution-2-tradeoffs)

(defn slide [context]
  [:div.slide.left
   [:h2 "Solution 2: Trade-offs"]
   [:h3 "Pros:"]
   [:ul
    [:li "Designers can work on pure HTML + CSS"]
    [:li "Static HTML prototype can be used directly for templating"]]
   [:h3 "Cons:"]
   [:ul
    [:li "A bit more tooling and glue needed"]
    [:li "Designers can't use react libraries directly"]]
   [:h3 "Common language: HTML and CSS"]])
