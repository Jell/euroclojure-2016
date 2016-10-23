(ns euroclojure.going-live)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "The boring things"]
   [:ul
    [:li "Use PhraseApp + " [:code "tower"] " for localization"]
    [:li "Add cache busting using some custom script"]
    [:li "Implement deploy script (we're using " [:code "ansible"] ")"]
    [:li "Add SSL certificates with CloudFront"]
    [:li "Add Honeybadger for error logging"]
    [:li "Add Travis for Continuous Integration"]
    [:li "Cross-browser testing with SauceLabs"]]
   (when speaker
     [:p "Running in prod for a while, keeps growing. Designers not satisfied with tooling, adding designer tools / libraries takes devs time. Introducing..."])])
