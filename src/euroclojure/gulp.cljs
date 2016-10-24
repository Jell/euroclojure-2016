(ns euroclojure.gulp)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Gulp"]
   [:ul
    [:li "Requested by designers to ease JavaScript tooling"]
    [:li "JavaScript build tool / task runner"]
    (when speaker
      [:li "like leiningen, but for node.js"])
    [:li "Can help integrating with a ton of JavaScript tooling"]
    (when speaker
      [:div
       [:div "Manage JavaScript & CSS dependencies"]
       [:br]
       [:div "Can compile SASS and minify CSS"]
       [:br]
       [:div "Cache-busting"]])
    [:li "Can run parallel tasks"]
    [:li "In our experience, ClojureScript and leiningen have not been
    great with non-cljs tooling"]
    (when speaker
      [:div "SASS compilation with leiningen was slow, took time to
      boot and crashed all the time"])
    [:br]
    [:em.centered "Gulp works well for us!"]
    [:br]
    (when speaker
      [:div "I have a feeling that if ClojureScript could use NPM
      instead of maven and be compiled using JS tooling, it would be a
      much simpler environment than what we're using today"])]])
