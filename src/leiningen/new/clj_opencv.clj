(ns leiningen.new.clj-opencv
  (:use [leiningen.new.templates :only [raw-resourcer renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "clj-opencv"))
(def raw (raw-resourcer "clj-opencv"))

(defn clj-opencv
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["samples/opencv3/collage.clj" (render "samples/opencv3/collage.clj" data)]
; project
["project.clj" (render "project.clj" data)]

; notes
["notes/practice.clj" (render "notes/practice.clj" data)]
["notes/empty.clj" (render "notes/empty.clj" data)]

; samples
["test/opencv3/ok.clj" (render "test/opencv3/ok.clj" data)]
["test/opencv3/simple.clj" (render "test/opencv3/simple.clj" data)]
["test/opencv3/tutorial.clj" (render "test/opencv3/tutorial.clj" data)]
["test/opencv3/videosample.clj" (render "test/opencv3/videosample.clj" data)]

; images
["resources/cat.jpg" (raw "resources/cat.jpg")]
["resources/minicat.jpg" (raw "resources/minicat.jpg")]
["resources/nekobench.jpg" (raw "resources/nekobench.jpg")]
["resources/souslesoleil.jpg" (raw "resources/souslesoleil.jpg")]
["resources/sunflower.jpg" (raw "resources/sunflower.jpg")]

; setting files
["resources/XML/aGest.xml" (render "resources/XML/aGest.xml")]
["resources/XML/palm.xml" (render "resources/XML/palm.xml")]
["resources/XML/face.xml" (render "resources/XML/face.xml")]
["resources/XML/closed_frontal_palm.xml" (render "resources/XML/closed_frontal_palm.xml")]
["resources/XML/fist.xml" (render "resources/XML/fist.xml")]
["resources/XML/haarcascade_eye_tree_eyeglasses.xml" (render "resources/XML/haarcascade_eye_tree_eyeglasses.xml")]
["resources/XML/haarcascade_frontalface_alt2.xml" (render "resources/XML/haarcascade_frontalface_alt2.xml")]

)))