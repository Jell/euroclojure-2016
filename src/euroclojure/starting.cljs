(ns euroclojure.starting)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "18 months ago..."]
   [:ul
    [:li "3 Ruby on Rails apps in production"]
    (when speaker
      [:div "with server-side rendered templates"])
    [:li "Amazon Web Services cloud infrastructure"]
    [:li "\"Don't like front-end stuff\""]
    (when speaker
      [:div "Rationalisation, bias to deal with complexity, been exposed to \"bad\" practices, don't know how to do stuff"])
    [:li "Value simplicity and agility"]
    [:li "Believe in empowering people"]
    [:li "Have a slack bot written in Clojure"]]])
