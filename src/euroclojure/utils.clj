(ns euroclojure.utils)

(defmacro code-snippet [type path]
  `[:> js/Highlight {:className ~type}
    ~(slurp path)])
