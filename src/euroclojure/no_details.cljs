(ns euroclojure.no-details)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Won't go into details"]
   [:em "BUT..."]
   (when speaker
     [:div "not much code"])])
