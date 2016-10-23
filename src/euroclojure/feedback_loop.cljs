(ns euroclojure.feedback-loop)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Basic Tooling: Live-Reload"]
   [:ul
    [:li "Introduce " [:code "figwheel"]]
    (when speaker
      [:p "No need for emacs, auto-reload and REPL for all, hot-code swapping"])
    [:li "Auto-test with " [:code "lein-doo"]]
    (when speaker
      [:p "Again, no need for REPL integration in editor"])
    [:li "Add design-mode using " [:code "browser-sync"]]
    (when speaker
      [:p "this was the designer's choice of tooling for working
      solely with HTML + CSS"])]
   [:em "Wow factor: super short feedback loop made us happy and productive"]])
