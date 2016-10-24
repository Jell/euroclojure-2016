(ns euroclojure.no-details)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Won't cover everything"]
   [:em.centered "BUT..."]
   (when speaker
     [:div "not much code"])])
