(ns euroclojure.enfocus-template
  (:require [enfocus.core :as ef])
  (:require-macros [enfocus.macros :refer [deftemplate]]))

(deftemplate render :compiled "templates/enfocus.html" [says-what]
  ["#enfocus-says"] (ef/content says-what))

(defn mount [node]
  (ef/at node "#enfocus"
    (ef/substitute (render "hello!"))))
