(ns euroclojure.why-clojurescript)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Why ClojureScript?"]
   [:ul

    [:li (when speaker "Bias: ")
     "We had 2 developers interested in Clojure"]

    [:li "A lot of uncertainties, but believed ClojureScript to be a good fit"]

    [:li "Considered many options"]
    (when speaker
      [:div "probably many other good alternatives, but we wanted to
      explore that option. I personally prefer Clojure semantics and
      trade-offs given my experience with the other languages I had
      worked with"])]])
