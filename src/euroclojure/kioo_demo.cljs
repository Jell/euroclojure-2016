(ns euroclojure.kioo-demo
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require [euroclojure.kioo-template :as template]))

(defn slide [options]
  [:div.slide
   [template/render]
   [:div
    (code-snippet "html" "resources/private/templates/kioo.html")
    (code-snippet "clojure" "src/euroclojure/kioo_template.cljs")]])
