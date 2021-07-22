(defproject cc.qbits/fn "1.0.0-alpha4-SNAPSHOT"
  :url "https://github.com/mpenet/fn"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.2"]]
  :deploy-repositories [["snapshots" :clojars] ["releases" :clojars]]
  :cljfmt {:remove-multiple-non-indenting-spaces? true}
  :global-vars {*warn-on-reflection* true})
