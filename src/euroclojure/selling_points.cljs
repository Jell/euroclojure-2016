(ns euroclojure.selling-points)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Selling points"]
   [:ul
    [:li "Better language semantics (equality, truthiness, scoping...)"]
    [:li "Namespaces"]
    [:li "Dead-code elimination"]
    [:li "Big standard library (Google Closure)"]
    [:li "Seamless JavaScript interop"]
    [:li "Static name resolution"]

    (when speaker
      [:div "Functional Programming was neither selling point nor a hurdle,
we were already writing ruby code in a functional way, even though that's
not very idiomatic"])
    [:li "Ran a 2-weeks experiment showcasing a ClojureScript app"]
    (when speaker
      [:div "also held a presentation and code walkthrough with all my colleagues"])]])
