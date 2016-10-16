(ns euroclojure.improve)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Introduce React"]
   [:ul
    [:li "direct DOM-manipulation too slow in our case"]
    [:li "use reagent library to interop with React"]
    [:li "replace enfocus with kioo for templating"]
    (when speaker
      [:p "Where enfocus offered DOM transformations, kioo provides a
      macro that transforms HTML into reagent datastructures."])]
   [:em "Wow factor: painlessly introduce react, transparent to designers"]])
