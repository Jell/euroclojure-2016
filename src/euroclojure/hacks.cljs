(ns euroclojure.hacks)

(defn slide []
  [:div.slide.left
   [:h2 "Hacks"]
   [:ul
    [:li "Run single test var from REPL"]
    [:a {:href "https://gist.github.com/Jell/76abeb78e8c472119079b951b1c2e9f5"
         :target "_blank"}
     "https://gist.github.com/Jell/76abeb78e8c472119079b951b1c2e9f5"]
    [:li "Use gulp-watch to touch cljs file on related assets changes"]
    [:li "Use window.open() to popup dev window/controls"]]])
