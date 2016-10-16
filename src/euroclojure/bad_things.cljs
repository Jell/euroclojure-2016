(ns euroclojure.bad-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h2 "Bad things"]
   [:h3 "Externs"]
   [:h3 "Broken iOS safari JIT compiler on iPhone 4"]
   [:h3 "Boilerplate for everything not Cljs"]
   (when speaker
     [:p "lots of progress being made outside of cljs, you still need to follow that progress"])])
