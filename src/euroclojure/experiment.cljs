(ns euroclojure.experiment)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   (when speaker
     [:div "To minimize risk and assess viability"])
   [:h1.centered "2-weeks experiment"]
   [:ul
    [:li "Is ClojureScript production ready?"]
    [:li "Can we be productive using ClojureScript?"]
    [:li "Can we address our pain-points using ClojureScript?"]]])
