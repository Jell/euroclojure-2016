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
  [:> js/Webcam {:height "400px" :width "400px" :audio false}])

(defn meta-content []
  [:div
   [:h1 "Meta"]
   [:p "Slides are demo are examples"]
   [:a {:href "https://github.com/Jell/euroclojure-2016"
        :target "_blank"}
    "https://github.com/Jell/euroclojure-2016"]
   [:br]])

(defn slide-recursion [children n]
  [:div
   [:div {:style {:border-left "solid"
                  :color (colors n)
                  :border-right "solid"
                  :border-radius "20px"
                  :padding "5px 5%"
                  :margin "2% 5%"
                  :position "fixed"
                  :width "80%"
                  :z-index (- 9999 n)
                  :float "left"}}
    [meta-content]
    [webcam]]
   [:div {:style {:transform (str "scale(0.618,0.618)")
                  :margin-left "30%"}}
    children]])

(defn slide [{:keys [speaker]}]
  [:div.slide.vertical-center {:style {:font-size "large"
                                       :height "666px"}}
   (if speaker
     [meta-content]
     (reduce slide-recursion [:p "..."] (range 10)))])
