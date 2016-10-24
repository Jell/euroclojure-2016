(ns euroclojure.demo)

(goog-define href "")

(def link
  [:a {:href href
       :target "_blank"}
   "https://demo-checkout.zimpler.net/demo.html"])

(defn slide [context]
  [:div.slide.centered
   [:h1 "Demo"]
   link])
