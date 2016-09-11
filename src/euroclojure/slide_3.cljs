(ns euroclojure.slide-3
  (:require-macros [euroclojure.utils :refer [show-code]]))

(defn template []
  [:> js/Slide3 {:callback #(js/alert "Clicked!")}
   [:div
    (show-code "jsx" "resources/private/javascript/Slide3.js")
    (show-code "clojure" "src/euroclojure/slide_3.cljs")]])
