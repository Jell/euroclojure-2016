(ns euroclojure.slide-1
  (:require-macros [euroclojure.utils :refer [show-code]]))

(defn template []
  [:div
   [:h1 "Slide 1!!"]
   (show-code "clojure" "src/euroclojure_cljs/slide_1.cljs")])
