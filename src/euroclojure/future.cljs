(ns euroclojure.future)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "The future?"]
   [:ul
    [:li "Our designers want to do more than what HTML and CSS allow them to do"]
    [:li "Learning ClojureScript has not been a skillset they are interested in acquiring"]
    [:li "Looking at alternatives: Maybe having templates as JavaScript dependencies?"]
    [:li "Use React's JSX template language, but let ClojureScript
    control the flow of the application"]
    [:li "Proof-of-concept ready, not used in production"]]])
