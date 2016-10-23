(ns euroclojure.rails-cljs-before-after
  (:require-macros [euroclojure.inline :refer [inline-file]]))

(defn slide []
  [:div.slide
   [:div.diagram
    {:dangerouslySetInnerHTML
     {:__html
      (inline-file "resources/public/images/RailsCljsBeforeAfter.svg")}}]])
