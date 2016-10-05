(ns euroclojure.bad-things)

;; TODO: more bad things
(defn slide [context]
  [:div.slide.left
   [:h2 "Bad things"]
   [:h3 "Broken iOS safari JIT compiler on iPhone 4"]
   [:ul
    [:li "Buggy bit operations triggered by JIT optimization"]
    [:li "Only certain iPhone 4 Hardware"]
    [:li "Doesn't happen with dev console open (JIT off)"]
    [:li "Took a week to figure out"]
    [:li "Happened to both of our production projects"]
    [:li "Redefine ClojureScript's polyfill of Math.imul as workaround"]]])
