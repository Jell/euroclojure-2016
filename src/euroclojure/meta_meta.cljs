(ns euroclojure.meta-meta
  (:require [reagent.core :as reagent]))

(def colors ["#EEE"
             "#EEE"
             "#EEE"
             "#DDD"
             "#CCC"
             "#BBB"
             "#AAA"
             "#999"
             "#888"
             "#000"])

(defn slide-recursion [children n]
  [:div
   [:div {:style {:border-left "solid"
                  :color (colors n)
                  :border-right "solid"
                  :border-radius "20px"
                  :padding "5px 50px"
                  :position "fixed"
                  :width "50%"
                  :z-index (- 9999 n)
                  :float "left"}}
    [:h1 "Meta"]
    [:p "Slides are demo are examples"]
    [:> js/Webcam {:height "400px" :width "400px"}]]
   [:div {:style {:transform (str "scale(0.618,0.618)")}}
    children]])

(defn slide []
  (reduce slide-recursion [:p "etc"] (range 10)))
