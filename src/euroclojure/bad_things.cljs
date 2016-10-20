(ns euroclojure.bad-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Bad things"]
   [:ul
    [:li "Externs"]
    [:li "Broken iOS safari JIT compiler on iPhone 4"]
    [:li "Safari needs :static-fn compiler option"]
    (when speaker
      [:div "means can't use figwheel in safari"])
    [:li "Boilerplate for everything not Cljs"]
    (when speaker
      [:div "lots of progress being made outside of cljs, you still need to follow that progress"])
    [:li "Familiarity is an issue, but not as bad as you might think"]
    (when speaker
      [:div "but it's not that hard, we all agree that getting into
      our cljs app is easier than getting into our rails app"])]])
