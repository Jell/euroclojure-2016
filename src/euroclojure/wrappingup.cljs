(ns euroclojure.wrappingup)

(defn slide [{:keys [speaker]}]
  [:div.slide.centered
   [:h1 "Wrapping up"]
   (if speaker
     [:p "go over some of the conclusions we reached"]
     [:p "Some take-away points..."])])
