(ns euroclojure.utils)

(defmacro code-snippet [type path]
  `[:div
    [:pre.path ~path]
    [:> js/Highlight {:className ~type}
     ~(slurp path)]])
