(ns euroclojure.slide-2
  (:require-macros [euroclojure.utils :refer [show-code]])
  (:require [kioo.reagent :as kioo :refer-macros [deftemplate]]))

(deftemplate template "templates/slide_2.html" []
  {[:button]
   (kioo/listen :on-click #(js/alert "Clicked!"))

   [:#code-snippet]
   (kioo/substitute
    [:div
     (show-code "html" "resources/private/templates/slide_2.html")
     (show-code "clojure" "src/euroclojure/slide_2.cljs")])})
