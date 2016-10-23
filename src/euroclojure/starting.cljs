(ns euroclojure.starting)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "18 months ago..."]
   [:ul
    [:li "3 Ruby on Rails apps in production"]
    (when speaker
      [:div "with server-side rendered templates"])
    [:li "Including a first version of our Checkout"]
    (when speaker
      [:div "spoilers: this is where we'll introduce ClojureScript"])
    [:li "Just hired our first Designer"]
    [:li "Planning to add a lot of new features to our checkout"
     (when speaker
       "in particular, new payment methods which will require massive
changes and more branching in our flow")]]])
