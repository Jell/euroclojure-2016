(ns euroclojure.improve)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Early Pivot"]
   [:ul
    [:li "Direct DOM-manipulation on each state change was too slow!"]
    [:li "Can we keep the logic but speedup rendering?"]
    (when speaker
      [:ul
       [:li "there was this library called React"]
       [:li "seemed to adress exactly this issue"]])
    [:li "What about " [:code "React"] "?"]
    (when speaker
      [:div "we looked at our options, settled for"])
    [:li "=> " [:code "reagent"] "!"]
    (when speaker
      [:div " a ClojureScript library that wraps " [:code "React"] " in idiomatic Clojure"])
    [:li "Use " [:code "kioo"]  " for templating (Drop-in replacement for " [:code "enfocus"] ")"]]

   [:em "Wow factor: painless transition to React, transparent to the
   designers"]])
