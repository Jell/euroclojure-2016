(ns euroclojure.future)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "The future?"]
   [:h2 "Webpack"]
   [:ul
    [:li "Many " [:code "React"] " libraries require using " [:code "webpack"]]
    [:li "Can empower designers that want to go beyond HTML but do not want to learn ClojureScript"]
    [:li "Proof-of-concept ready, not used in production"]]])
