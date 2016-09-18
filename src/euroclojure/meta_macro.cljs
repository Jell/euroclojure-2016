(ns euroclojure.meta-macro
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide []
  [:div.slide-padding
   [:h1 "Meta: code snippet macro"]
   (code-snippet "clojure" "src/euroclojure/utils.clj")])
