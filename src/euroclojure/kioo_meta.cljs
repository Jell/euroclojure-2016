(ns euroclojure.kioo-meta
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require [kioo.reagent :as kioo :refer-macros [deftemplate]]))

(deftemplate slide "templates/kioo_meta.html" []
  {[:#kioo-says] (kioo/content "hello!")

   [:#code-snippet]
   (kioo/substitute
    [:div
     (code-snippet "html" "resources/private/templates/kioo_meta.html")
     (code-snippet "clojure" "src/euroclojure/kioo_meta.cljs")])})
