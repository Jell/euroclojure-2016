(ns euroclojure.inline
  (:require [clojure.data.codec.base64]
            [clojure.java.io :refer [file input-stream]]
            [clojure.string :as str]))

(defn read-binary-file [file-path]
  (with-open [reader (input-stream file-path)]
    (let [length (.length (file file-path))
          buffer (byte-array length)]
      (.read reader buffer 0 length)
      buffer)))

(defn read-file-as-base64-string [file-path]
  (String.
   (clojure.data.codec.base64/encode
    (read-binary-file file-path))))

(defmacro inline-file [path]
  (slurp path))

(defmacro img [{:keys [src] :as options}]
  (let [file-type (last (str/split src #"\."))
        file-path (str "resources/public/" src)]
    [:img (assoc options :src
                 (str "data:image/" file-type ";base64,"
                      (read-file-as-base64-string file-path)))]))
