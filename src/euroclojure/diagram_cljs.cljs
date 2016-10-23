(ns euroclojure.diagram-cljs
  (:require-macros [euroclojure.inline :refer [inline-file]]))

(defn slide []
  [:div.slide
   [:div.diagram
    {:dangerouslySetInnerHTML
     {:__html
      (inline-file "resources/public/images/RailsCljsProcess.svg")}}]])
