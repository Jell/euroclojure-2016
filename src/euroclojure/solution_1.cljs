(ns euroclojure.solution-1
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide []
  [:div
   [:h1 "Solution 1: pure ClojureScript"]
   [:button {:on-click #(js/alert "Clicked!")}
    "Click Me!"]
   (code-snippet "clojure" "src/euroclojure/solution_1.cljs")])
