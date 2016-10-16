(ns euroclojure.enfocus-demo
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require [reagent.core :as reagent]
            [enfocus.core :as ef]
            [euroclojure.enfocus-template :refer [mount]]))

(defn slide [opts]
  (reagent/create-class
   {:component-did-mount
    (fn [component]
      (let [node (reagent/dom-node component)]
        (mount node)))

    :reagent-render
    (fn render-enfocus-slide [_]
      [:div.slide
       [:div#enfocus "replace-me"]
       (code-snippet "html" "resources/private/templates/enfocus.html")

       (code-snippet "clojure" "src/euroclojure/enfocus_template.cljs")])}))
