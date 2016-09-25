(ns euroclojure.meta-macro
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide []
  [:div.slide
   [:h2 "Bonus: code snippet macro"]
   (code-snippet "clojure" "src/euroclojure/utils.clj")])
