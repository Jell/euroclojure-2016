(ns euroclojure.improve)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Introduce React"]
   [:ul
    [:li "direct DOM-manipulation too slow in our case"]
    [:li "maybe use virtual DOM?"]
    [:li "use reagent library to interop with " [:code "React"]]
    [:li "replace " [:code "enfocus"] " with "[:code "kioo"] " for templating"]
    (when speaker
      [:p "Where enfocus offered DOM transformations, kioo provides a
      macro that transforms HTML into reagent datastructures."])]

   [:em "Wow factor: painlessly introduce " [:code "React"] ", transparent to designers"]
   (when speaker
     [:div
      [:p "structure organically growing from a single namespace. Routing logic growing? put in separate namespace."]
      [:p "Clojure's data-first + libraries over framework = agile"]
      ])])
