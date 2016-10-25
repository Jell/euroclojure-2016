(ns euroclojure.we-are-live)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "MVP live!"]
   [:ul
    [:li "Took us 3 months to be ready"]
    [:li "Start to focus on new features!"]]])
