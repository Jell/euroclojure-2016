(ns euroclojure.tools)

(defn code-listing [& things]
  [:div
   (interpose ", " (map-indexed (fn [i thing] ^{:key i} [:code thing]) things))])

(defn slide [opts]
  [:div.slide.left
   [:h1.centered "Tools"]
   [:ul
    [:li "Libraries"]
    (code-listing "core.async" "tower" "environ" "schema"
                  "cljs-ajax" "libphonenumber" "stuartsierra/component"
                  "react" "reagent" "re-frame" "kioo" "clj-time"
                  "bidi" "cuerdas" "cljsjs/clipboard")

    [:li "ClojureScript tooling"]
    (code-listing "figwheel" "lein-doo" "piggieback" "cider" "nrepl" "clj-webdriver")

    [:li "General tooling"]
    (code-listing "npm" "bower" "gulp" "browser-sync" "phantomjs" "entr"
                  "foreman" "make" "sassc" "find" "touch" "grep")]])
