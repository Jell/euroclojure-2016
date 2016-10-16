(ns euroclojure.gulp)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Gulp"]
   [:ul
    [:li "JavaScript build tool / task runner"]
    (when speaker
      [:p "Can run SASS compiler + figwheel with gulp dev task"])
    [:li "Manage bower dependencies"]
    [:li "Can run parallel tasks"]
    [:li "Can implement custom watchers (reload templates)"]
    [:li "Can compile SASS and minify CSS"]
    [:li "Cache-busting (replacing grunt)"]
    [:li "Not bound to ClojureScript"]]])
