(ns euroclojure.future)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1 "The future?"]
   [:h2 "Wepack"]
   [:ul
    [:li "Many React libraries require using webpack"]
    [:li "Can empower designers that want to go beyond HTML but do not want to learn ClojureScript"]
    [:li "Proof-of-concept ready, not used in production"]]])
