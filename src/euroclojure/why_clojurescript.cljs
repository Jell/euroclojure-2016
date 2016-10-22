(ns euroclojure.why-clojurescript)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Why ClojureScript?"]
   [:ul
    [:li "Framework or Libraries?"]
    (when speaker
      [:div "since we didn't know much about front-end, prefer to grow
      our architecture ourselves to know what to choose. Also want to keep the app as lean as possible to avoid loading latency"])
    [:li "JavaScript or Compile to JavaScript?"]
    (when speaker
      [:div "modern JS is compile to JS anyway"])
    [:li "CoffeeScript? TypeScript? ClojureScript? Elm? " [:em "Semantics + Minimize Risk"]]
    (when speaker
      [:div "CoffeeScript is not enough, would rather use latest
    JS. But semantics are not great. Bias: we had two Clojure
    programmers"])
    [:li "ClojureScript: namespaces, dead-code elimination, big standard library (Google Closure), seamless JavaScript interop, static name resolution"]
    (when speaker
      [:div "not even mentioning the usual Functional Programming and
      immutable datastructures, hard to sell on those"])]])
