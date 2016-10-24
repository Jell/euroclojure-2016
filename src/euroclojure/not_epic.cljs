(ns euroclojure.not-epic)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "The journey"]
   [:ul
    [:li "Not epic"]
    (when speaker
      [:div "No epic battles, no fights"])
    [:li "A mindful walk"]
    (when speaker
      [:div "many small steps, trying to be aware of ourselves and our
      pain-points"])
    [:li "A lot of small surprises and happiness"]
    (when speaker
      [:div "I hope I can convey some of those feelings throughout my presentation"])]])
