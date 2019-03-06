(defproject clj-opencv/lein-template "0.0.30-SNAPSHOT"
  :description "Created with lein-create-template"
  :url "http://example.com/FIXME"
  :deploy-repositories [["releases" :clojars]]
:release-tasks [["vcs" "assert-committed"]
            ["change" "version" "leiningen.release/bump-version" "release"]
            ["vcs" "commit"]
            ["vcs" "tag" "--no-sign"]
            ["deploy" "clojars"]
            ["change" "version" "leiningen.release/bump-version"]
            ["vcs" "commit"]
            ["vcs" "push"]
            ]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true)