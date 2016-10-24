(ns euroclojure.not-epic)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "The journey"]
   [:ul
    [:li "Not epic"]
    (when speaker
      [:div "No battles, no fights, no great victories or epic failures"])
    [:li "A mindful walk"]
    (when speaker
      [:div "many small steps, trying to be aware of ourselves and our
      pain-points"])
    [:li "Many small surprises and moments of happiness"]
    (when speaker
      [:div "I hope I can convey some of those feelings during my presentation"])]])
