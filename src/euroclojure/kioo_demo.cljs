(ns euroclojure.kioo-demo
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require [kioo.reagent :as kioo :refer-macros [deftemplate]]))

(deftemplate slide "templates/kioo.html" []
  {[:#kioo-says] (kioo/content "hello!")

   [:#code-snippet]
   (kioo/substitute
    [:div
     (code-snippet "html" "resources/private/templates/kioo.html")
     (code-snippet "clojure" "src/euroclojure/kioo_demo.cljs")])})
