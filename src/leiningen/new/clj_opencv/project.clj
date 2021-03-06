(defproject {{ns-name}} "0.1-SNAPSHOT"
  :test-paths ["test"]
  :plugins [;[hellonico/lein-gorilla "0.4.2"]
            [lein-auto "0.1.3"] [lein-jupyter "0.1.16"]]
  :auto {:default {:file-pattern #"\.(clj)$"}}
  :main opencv4.ok
  :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
; :aliases {"notebook" ["gorilla" ":ip" "0.0.0.0" ":port" "10000"]}
  :aliases {"lena" ["run" "-m" "opencv4.lena"]
            "ok" ["run" "-m" "opencv4.ok"]
            "video" ["run" "-m" "opencv4.videosample"]
            "youtube" ["run" "-m" "opencv4.youtube"]
            "simple" ["run" "-m" "opencv4.simple"]}
  :profiles {:dev {:resource-paths ["resources"]
                   :dependencies [; used for proto repl
  ; [org.clojure/tools.nrepl "0.2.11"]
  ; proto repl
  ; [proto-repl "0.3.1"]
  ; use to start a gorilla repl
  ; [hellonico/gorilla-repl "0.4.1"]
                                  [seesaw "1.4.5"]]}}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [origami "{{version}}"]
                 [origami/filters "{{version-filters}}"]
                 [origami/sources "{{version-sources}}"]

 ; uncomment to use only the binary for your platform
 ;[origami "{{version}}" :exclusions [opencv/opencv-native]]
 ;[opencv/opencv-native "{{version}}" :classifier "osx_64"]
 ;[opencv/opencv-native "{{version}}" :classifier "linux_64"]
 ;[opencv/opencv-native "{{version}}" :classifier "windows_64"]
                 ])