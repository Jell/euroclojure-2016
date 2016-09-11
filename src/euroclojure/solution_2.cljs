(ns euroclojure.solution-2
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require [kioo.reagent :as kioo :refer-macros [deftemplate]]))

(deftemplate slide "templates/solution_2.html" []
  {[:button]
   (kioo/listen :on-click #(js/alert "Clicked!"))

   [:#code-snippet]
   (kioo/substitute
    [:div
     (code-snippet "html" "resources/private/templates/solution_2.html")
     (code-snippet "clojure" "src/euroclojure/solution_2.cljs")])})
