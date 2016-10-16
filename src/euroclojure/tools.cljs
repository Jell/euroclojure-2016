(ns euroclojure.tools)

(defn slide [opts]
  [:div.slide.left
   [:ul
    [:li "Libraries"]
    [:div "core.async, tower, environ, schema, cljs-ajax, libphonenumber, stuartsierra/component, react, reagent, re-frame, kioo, clj-time, bidi, cuerdas, cljsjs/clipboard"]
    [:li "ClojureScript tooling"]
    [:div "figwheel, lein-doo, piggieback, cider, nrepl, clj-webdriver"]
    [:li "General tooling"]
    [:div "npm, bower, gulp, browser-sync, phantomjs, entr, foreman, make, sassc, find, touch, grep"]]])
