(ns euroclojure.what-kind-of-app)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "What kind of app?"]
   [:ul
    [:li "Keep backend logic in existing Rails app"]
    (when speaker
      [:p "State management in the backend"])
    [:li "Pure front-end talking to API"]
    (when speaker
      [:p "flow and view in frontend"])
    [:li "Turn Rails app into pure JSON REST API"]
    [:li "Host ClojureScript app as a single file on Amazon's S3"]
    (when speaker
      [:p "High availability, simpler & faster deploy"])]])
