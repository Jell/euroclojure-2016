(ns euroclojure.good-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h2 "Good things"]
   [:h3 "Made me love front-end work!"]
   (when speaker
     [:p "Passion and engagement is a business value. Also marketing, look at me talking about Zimpler here!"])
   [:h3 "re-frame / reagent / single atom state"]
   (when speaker
     [:ul
      [:li "On error, upload the whole state"]
      [:li "Trivial time-travelling debugger"]
      [:li [:em "Work in progress: "] "on error, upload time-travelling debug state!"]])
   [:h3 "Gulp"]
   (when speaker
     [:ul
      [:li "Possible workflow with or without ClojureScript"]
      [:li "Task runner"]
      [:li "Cache-busting URLs"]])
   [:h3 "ClojureScript Macros"]
   (when speaker
     [:p "you have your own babel compiler"])])
