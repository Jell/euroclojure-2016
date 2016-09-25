(ns euroclojure.good-things)

(defn slide []
  [:div.slide.left
   [:h2 "Good things"]
   [:h3 "re-frame"]
   [:ul
    [:li "On error, upload the whole state"]
    [:li "Trivial time-travelling debugger"]
    [:li [:em "Work in progress: "] "on error, upload time-travelling debug state!"]]
   [:h3 "Gulp"]
   [:ul
    [:li "Possible workflow with or without ClojureScript"]
    [:li "Task runner"]
    [:li "Cache-busting URLs"]]])
