(ns euroclojure.good-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Good things"]
   [:ul
    [:li "Made me love front-end work!"]
    [:li "Organically grew the project & structure of the app"]
    (when speaker
      [:div "only add abstractions when needed, many small steps"])
    [:li "People got empowered"]
    (when speaker
      [:div "Both devs and designers are getting more things faster
      and independently. Designers are able to deploy changes on their
      own, even A/B tests."])]])
