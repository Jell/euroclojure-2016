(ns euroclojure.demo)

(defn slide []
  [:div.slide.centered
   [:h1 "Demo"]
   [:a {:href "https://demo.zimpler.net"
        :target "_blank"}
    "https://demo.zimpler.net"]
   [:br]
   [:br]
   [:p "(Need a Swedish or Finnish number, or use 0700000000)"]])
