(ns euroclojure.demo)

(defn slide [context]
  [:div.slide.centered
   [:h1 "Demo"]
   [:a {:href "https://demo-checkout.zimpler.net/demo.html"
        :target "_blank"}
    "https://demo-checkout.zimpler.net/demo.html"]])
