(ns euroclojure.solution-3
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide []
  [:> js/Solution3 {:callback #(js/alert "Clicked!")}
   [:div
    (code-snippet "jsx" "resources/private/javascript/Solution3.js")
    (code-snippet "clojure" "src/euroclojure/solution_3.cljs")]])
