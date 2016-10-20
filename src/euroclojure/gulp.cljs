(ns euroclojure.gulp)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Gulp"]
   [:ul
    [:li "JavaScript build tool / task runner"]
    [:li "Can help integrating with a ton of JavaScript tooling"]
    (when speaker
      [:ul
       [:li "Manage JavaScript & CSS dependencies"]
       [:li "Can compile SASS and minify CSS"]
       [:li "run webpack"]
       [:li "Cache-busting (replacing grunt)"]])
    [:li "Can run parallel tasks"]
    [:li "Not bound to ClojureScript"]
    (when speaker
      [:div "JavaScript tooling moves very fast! Waiting for
       ClojureScript to catch up = lagging behind. Integrating Cljs
       inside JS workflow worked better for us."])]])
