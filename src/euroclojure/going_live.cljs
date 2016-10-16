(ns euroclojure.going-live)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "Going live"]
   [:ul
    [:li "Use PhraseApp + tower for localization"]
    [:li "Add cache busting via Grunt task"]
    [:li "Add SSL certificates with CloudFront"]
    [:li "Add Honeybadger for error logging"]
    [:li "Add Travis for CI"]
    [:li "Cross-browser testing with SauceLabs"]]
   (when speaker
     [:p "Running in prod for a while, keeps growing. Designers not satisfied with tooling, adding designer tools / libraries takes devs time. Introducing..."])])
