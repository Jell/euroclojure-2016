(ns euroclojure.conclusion)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Our Believes"]
   [:ul
    [:li "Aim at empowering people"]
    (when speaker
      [:div "we focused on that from the beginning, and it seemed to
      have worked well"])
    [:li "Pain-points Driven Development"]
    (when speaker
      [:div "Onl"])
    [:li "Be patient, Be prepared"]
    [:li "Take time to spread knowledge"]
    [:li "Don't try to solve everything in ClojureScript"]]])
