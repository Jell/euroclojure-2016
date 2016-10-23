(ns euroclojure.bad-things)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Bad things"]
   [:ul
    [:li "ClojureScript was out of our confort zone"]
    (when speaker
      [:div "some learning cost upfront"])
    [:li "Tooling setup overhead is still significant"]
    (when speaker
      [:div "many iterations to get to where we are"])
    [:li "the iPhone 4 bug"]
    (when speaker
      [:div "alredy mentioned, but biggest time sink"])
    [:li "Remember: new tool = first blame"]]
   (when speaker
     [:div "all in all, we don't regret the choice we made"])])
