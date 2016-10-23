(ns euroclojure.we-are-live)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "MVP live!"]
   [:ul
    ;; TODO: insert time it took to get there
    [:li "Start to focus on new features!"]]
   (when speaker
     [:p "Running in prod for a while, keeps growing. Designers not satisfied with tooling, adding designer tools / libraries takes devs time. Introducing..."])])
