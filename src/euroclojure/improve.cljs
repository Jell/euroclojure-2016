(ns euroclojure.improve)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Early Pivot"]
   [:ul
    [:li "that approach to DOM-manipulation"]
    (when speaker
      [:ul
       [:li "there was this library called React"]
       [:li "React too big"]
       [:li "enfocus too slow"]
       [:li "drop-in replacement, fast-enough without manual optimization"]])
    [:li "Why not " [:code "React"] " from the beginning?"]
    [:li "We chose " [:code "reagent"]]
    (when speaker
      [:div " a ClojureScript library that wraps " [:code "React"]])
    [:li "Use " [:code "kioo"]  " for templating (Drop-in replacement for " [:code "enfocus"] ")"]
    (when speaker
      [:div "we really like the flow we had, so we wanted to make sure
      we kept it when transitioning to React"])]

   [:em "Personal Thought: How painless this transition was gave me confidence in the viability of ClojureScript"]])
