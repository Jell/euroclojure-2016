(ns euroclojure.wrappingup)

(defn slide [{:keys [speaker]}]
  [:div.slide.centered
   [:h1 "Wrapping up"]
   [:p "Some take-away points..."]])
