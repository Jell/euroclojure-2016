(ns euroclojure.going-live)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "The boring things"]
   [:ul
    [:li "Use PhraseApp + " [:code "tower"] " for localization"]
    [:li "Add cache busting using some custom script"]
    [:li "Implement deploy script (we're using " [:code "ansible"] ")"]
    [:h2 "Breathe"]
    [:li "Add SSL certificates with CloudFront"]
    [:li "Add Honeybadger for error logging"]
    [:h2 "Breathe"]
    [:li "Add Travis for Continuous Integration"]
    [:li "Cross-browser testing with SauceLabs"]]])
