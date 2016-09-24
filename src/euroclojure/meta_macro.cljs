(ns euroclojure.meta-macro
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide []
  [:div.slide
   [:h2 "Meta: code snippet macro"]
   (code-snippet "clojure" "src/euroclojure/utils.clj")])
