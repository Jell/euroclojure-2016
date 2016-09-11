(ns euroclojure.utils)

(defmacro show-code [type path]
  `[:> js/Highlight {:className type}
    ~(slurp path)])
