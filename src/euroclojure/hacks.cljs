(ns euroclojure.hacks)

(defn slide [context]
  [:div.slide.left
   [:h1.centered "Hacks"]
   [:ul
    [:li "Run single test var from REPL"]
    [:a {:href "https://gist.github.com/Jell/76abeb78e8c472119079b951b1c2e9f5"
         :target "_blank"}
     "https://gist.github.com/Jell/76abeb78e8c472119079b951b1c2e9f5"]
    [:li "Use " [:code "gulp-watch"] " to touch cljs file on related assets changes"]
    [:li "Use " [:code "window.open()"] " to popup dev window/controls"]]])
