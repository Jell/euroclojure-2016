(ns euroclojure.localized
  (:require-macros [euroclojure.utils :refer [code-snippet]])
  (:require [euroclojure.locale :refer [t]]
            [kioo.reagent :as kioo :refer-macros [deftemplate]]))

(def locale (delay :en))

(defn localize [node]
  (let [msg (->> node :attrs :data-localize keyword (t @locale))]
    (-> node
        (assoc-in [:attrs :dangerouslySetInnerHTML :__html] msg)
        (dissoc :content))))

(deftemplate slide "templates/localized.html" []
  {[(attr? :data-localize)] localize

   [:#code-snippet]
   (kioo/substitute
    [:div
     (code-snippet "html" "resources/private/templates/localized.html")
     (code-snippet "clojure" "src/euroclojure/localized.cljs")])})
