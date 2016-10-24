(ns euroclojure.kioo-template
  (:require [reagent.core :as reagent]
            [kioo.reagent :as kioo :refer-macros [deftemplate]]))

(deftemplate render "templates/kioo.html" []
  {[:#kioo-says] (kioo/content "Dynamic Content!")})

(defn mount [node]
  (reagent/render-component [render] node))
