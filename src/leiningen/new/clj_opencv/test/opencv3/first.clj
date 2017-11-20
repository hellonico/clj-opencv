(ns opencv3.first
  (:require
    [opencv3.utils :as u]
    [opencv3.core :refer :all]))

(def vertical-matrix
  [ [-1 0 1]
    [-2 0 2]
    [-1 0 1]])

(defn -main[ & args]
  (println (.dump (u/matrix-to-mat vertical-matrix))))
