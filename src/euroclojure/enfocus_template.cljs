(ns euroclojure.enfocus-template
  (:require [enfocus.core :as ef])
  (:require-macros [enfocus.macros :refer [deftemplate]]))

(deftemplate render :compiled "templates/enfocus.html" []
  ["#enfocus-says"] (ef/content "Hello EuroClojure!"))

(defn mount [node]
  (ef/at node "#enfocus"
    (ef/substitute (render))))
