(ns euroclojure.good-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Good things"]
   [:ul
    [:li "Made me love front-end work!"]
    (when speaker
      [:div "Passion and engagement is a business value. Also marketing, look at me talking about Zimpler here!"])
    [:li "reagent / single atom state"]
    (when speaker
      [:div
       [:span "On error, upload the whole state"]
       [:br]
       [:span "Trivial time-travelling debugger"]
       [:br]
       [:span [:em "Work in progress: "] "on error, upload time-travelling debug state!"]])
    [:li "Gulp"]
    (when speaker
      [:div
       [:span "Possible workflow with or without ClojureScript"]
       [:br]
       [:span "Task runner"]
       [:br]
       [:span "Cache-busting URLs"]])
    [:li "ClojureScript Macros"]
    (when speaker
      [:div "you have your own babel compiler"])]])
