(ns euroclojure.feedback-loop)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Shorten feedback loop"]
   [:ul
    [:li "Introduce figwheel"]
    (when speaker
      [:p "No need for emacs, auto-reload and REPL for all, hot-code swapping"])
    [:li "Auto-test with lein-doo"]
    (when speaker
      [:p "Again, no need for REPL integration in editor"])
    [:li "Add design-mode using browser-sync & design cards"]
    (when speaker
      [:p "Designers can keep working without touching ClojureScript"])]
   [:em "Wow factor: sub-second feedback loop on CSS and code changes"]])
