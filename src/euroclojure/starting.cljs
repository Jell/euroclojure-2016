(ns euroclojure.starting)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "18 months ago"]
   [:ul
    [:li "3 Rails apps in production"]
    [:li "AWS infrastructure"]
    [:li "\"Don't like front-end stuff\""]
    (when speaker
      [:p "Rationalisation, bias to deal with complexity, been exposed to \"bad\" practices, don't know how to do stuff"])
    [:li "Value simplicity and agility"]
    [:li "Believe in empowering people"]
    [:li "Have a slack bot written in Clojure"]]])
