(ns euroclojure.locale
  (:require [taoensso.tower :as tower
             :refer-macros [dict-compile]]))

(def my-tconfig
  {:compiled-dictionary ; Map or named resource containing map
   (dict-compile
    {:en {:tower {:say-hi "Hello from **tower!**"}}
     :sv {:tower {:say-hi "Hejsan från **tower!**"}}})
   :fallback-locale :en})

(def t (tower/make-t my-tconfig))
