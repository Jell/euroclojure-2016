(ns euroclojure.slide-1
  (:require-macros [euroclojure.utils :refer [show-code]]))

(defn template []
  [:div
   [:h1 "Solution 1: pure ClojureScript"]
   [:button {:on-click #(js/alert "Clicked!")}
    "Click Me!"]
   (show-code "clojure" "src/euroclojure/slide_1.cljs")])
