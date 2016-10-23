(ns euroclojure.phase1)

(defn slide [{:keys [speaker]}]
  [:div.slide.centered
   (when speaker
     [:div "So at this point, we decided to give ClojureScript a try. Then began: "])
   [:h1 "Phase 1"]
   [:em "The Baby Steps"]
   (when speaker
     [:div "A few of the steps and misteps we took when we were trying to figure out how to build a Single Page Application"])])
