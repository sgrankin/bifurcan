(defproject bifurcan "0.1.0-SNAPSHOT"
  :java-source-paths ["src"]
  :dependencies []
  :plugins [[lein-virgil "0.1.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [org.clojure/test.check "0.9.0"]
                                  [criterium "0.4.3"]]}}
  :jvm-opts ^:replace ["-server" "-Xmx10g" "-XX:-OmitStackTraceInFastThrow" "-Xss750k"])