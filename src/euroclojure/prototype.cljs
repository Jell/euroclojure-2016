(ns euroclojure.prototype)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Prototype"]
   [:ul
    [:li "Designer works on HTML + CSS mockup"]
    (when speaker
      [:p "No need to wait for developers to setup tools to get started, use any tool that focuses on HTML+CSS"])
    [:li "Developers work on state management"]
    (when speaker
      [:p "API calls, Deploy script, tests"])
    [:li "Use HTML mockup directly as template using enfocus"]
    (when speaker
      [:p "will explain in a moment"])
    [:li "Use pure-HTML as " [:em "lingua franca"]]]
   [:em "Wow factor: parallel work from ground up, no wasted cycles"]])
