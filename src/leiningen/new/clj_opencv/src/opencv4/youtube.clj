(ns opencv4.youtube
  (:import [origami.video YouTubeHandler])
  (:require
   [opencv4.utils :as cvu]))

(defn -main [& args]
  (let [; register handler
        _ (YouTubeHandler.)]
    (cvu/simple-cam-window {:video {:device "youtube://DXUAyRRkI6k/0"}} identity)))