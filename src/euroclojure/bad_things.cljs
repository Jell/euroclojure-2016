(ns euroclojure.bad-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Bad things"]
   [:ul
    [:li "Externs"]
    [:li "Broken iOS safari JIT compiler on iPhone 4"]
    [:li "Safari needs :static-fn compiler option"]
    (when speaker
      [:p "means can't use figwheel in safari"])
    [:li "Boilerplate for everything not Cljs"]
    (when speaker
      [:p "lots of progress being made outside of cljs, you still need to follow that progress"])]])
