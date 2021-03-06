(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :source-paths ["src" "src/{{name}}"]

  :dependencies [[compojure "1.2.1"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/clojure "1.6.0"]
                 [hiccup "1.0.5"]]

  :plugins [[lein-ring "0.8.13"]
            [lein-cljsbuild "1.0.3"]]

  :hooks [leiningen.cljsbuild]

  :repl-options {:init-ns {{name}}}

  :cljsbuild {
    :builds [{:source-paths ["src/{{name}}/cljs"]
              :compiler {:output-to "resources/public/js/{{name}}.js"
                         :optimizations :whitespace
                         :pretty-print true
                         ;; :source-map "resources/public/js/{{name}}.js.map"
                         }}]}

  :ring {:handler {{name}}.handler/app}

  :profiles
    {:dev {:dependencies [[ring-mock "0.1.5"]
                          [javax.servlet/servlet-api "2.5"]]}})
