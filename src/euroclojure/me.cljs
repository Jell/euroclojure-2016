(ns euroclojure.me)

(defn slide []
  [:div.centered.large-text
   [:h2 "Hello!"]
   [:img {:src "/images/shining.png" :height "300px"}]
   [:div "from Göteborg, Sweden"]
   [:div "\uD83D\uDC96 Clojure \uD83D\uDC96"]
   [:div "Organizer of "
    [:a {:href "https://www.meetup.com/got-lambda/"} "Got.λ"]]])
