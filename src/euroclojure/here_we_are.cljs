(ns euroclojure.here-we-are)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "That's where we are now"]
   [:ul
    [:li "we've been using that setup for over a year"]
    [:li "we reduced the overall complexity"]
    [:li "we were able to implement all the new features we wanted"]]
   [:br]
   [:em.centered "Mission Accomplished!"]])
