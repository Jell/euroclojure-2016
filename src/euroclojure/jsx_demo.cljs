(ns euroclojure.jsx-demo
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require webpack-bundle))

(defn slide [context]
  [:> js/JSXComponent {:saysWhat "hello!"}
   [:div
    (code-snippet "jsx" "resources/private/javascript/jsx_component.js")
    (code-snippet "clojure" "src/euroclojure/jsx_demo.cljs")]])
