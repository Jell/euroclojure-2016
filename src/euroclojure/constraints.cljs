(ns euroclojure.constraints)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Constraints"]
   [:ul
    [:li "High aivalability"]
    (when speaker
      [:div "service that others consume, need to always be up"])
    [:li "Acceptable barrier of entry for new designers & developers"]
    (when speaker
      [:div "planning to hire more people, important that they don't
      get overwhelmed by our code"])
    (when speaker
      [:h2 "breathe"])
    [:li "Simple development environment"]
    (when speaker
      [:div "we don't want to force everyone to live inside emacs"])
    [:li "Fast and Simple deploys"]
    (when speaker
      [:div "want to iterate faster, so deploy easily and often"])]])
