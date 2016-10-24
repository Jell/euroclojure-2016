(ns euroclojure.we-are-live)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "MVP live!"]
   [:ul
    ;; TODO: insert time it took to get there
    [:li "Start to focus on new features!"]]])
