(ns euroclojure.reagent-demo
  (:require-macros [euroclojure.utils :refer [code-snippet]]))

(defn slide [context]
  [:div.slide
   [:div.demo-container
    [:span "Reagent says: "]
    [:b "hello!"]]
   (code-snippet "clojure" "src/euroclojure/reagent_demo.cljs")])
