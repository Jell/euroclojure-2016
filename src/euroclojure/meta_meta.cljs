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

(defn webcam []
  [:> js/Webcam {:height "300px" :width "400px" :audio false}])

(defn meta-content [camera]
  [:div
   [:h2 "Meta"]
   [:div "Slides written in Cljs"
    [:br] "Demo of our prod setup"]
   [:br]
   camera
   [:br]
   [:br]
   [:span.centered "Source: "
    [:a {:href "https://github.com/Jell/euroclojure-2016"
                  :target "_blank"}
     "https://github.com/Jell/euroclojure-2016"]]])

(defn slide-recursion [children n]
  [:div
   [:div {:style {:border-left "solid"
                  :color (colors n)
                  :border-right "solid"
                  :border-radius "20px"
                  :padding "5px 2%"
                  :margin "0 5%"
                  :position "fixed"
                  :width "85%"
                  :z-index (- 9999 n)
                  :float "left"}}
    [meta-content [webcam]]]
   [:div {:style {:transform "translate(16%,50%) scale(0.618)"}}
    children]])

(defn slide [{:keys [speaker]}]
  [:div.slide.vertical-center
   {:style {:height "666px"}}
   (if speaker
     [meta-content nil]
     (reduce slide-recursion [:p "..."] (range 10)))])
