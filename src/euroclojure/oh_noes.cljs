(ns euroclojure.oh-noes)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "oh noes!"]
   [:ul
    [:li "Random errors in production on iPhone 4!"]
    [:li "Appears to be in hash lookup logic"]
    [:li "One week of debugging later..."]
    [:li "Broken iOS safari JIT compiler on certain hardware"]
    [:li "Did a work-around in our projects"]
    [:br]
    [:em.centered "Big waste of time for us"]]
   (when speaker
     [:div "Just so you know, this is still a thing. The patch is in
     the slides though."])])
