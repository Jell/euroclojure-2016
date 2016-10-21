(ns euroclojure.utils
  (:require [clojure.string :as str]))

(defn read-src [type path]
  (cond-> (slurp path)
    (= "clojure" type)
    (str/replace-first #"(?s)\(ns euroclojure.+?\(def" "(def")))

(defmacro code-snippet [type path]
  `[:div
    [:pre.path ~path]
    [:> js/Highlight {:className ~type}
     ~(read-src type path)]])
