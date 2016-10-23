(ns euroclojure.phase2)

(defn slide [{:keys [speaker]}]
  [:div.slide.centered
   (when speaker
     [:div "We finally had a working application that's fast enough and the basic features we needed"])
   [:h1 "Phase 2"]
   [:em "Going to production"]])
