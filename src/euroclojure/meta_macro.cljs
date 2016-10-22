(ns euroclojure.meta-macro
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide [context]
  [:div.slide
   [:h1.centered "Bonus: code snippet macro"]
   (code-snippet "clojure" "src/euroclojure/utils.clj")])
