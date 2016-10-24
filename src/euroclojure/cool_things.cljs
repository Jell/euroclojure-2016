(ns euroclojure.cool-things
  (:require [euroclojure.demo :as demo]))

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   [:h1.centered "Cool things"]
   [:ul
    [:li "Upload whole app state on exceptions"]
    [:li "Time-travelling debugger"]
    [:li "REPL-driven tests (" demo/link ")"]]])
