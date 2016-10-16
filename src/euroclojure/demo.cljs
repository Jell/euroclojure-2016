(ns euroclojure.demo)

(goog-define href "")

(defn slide [context]
  [:div.slide.centered
   [:h1 "Demo"]
   [:a {:href href
        :target "_blank"}
    "https://demo-checkout.zimpler.net/demo.html"]])
