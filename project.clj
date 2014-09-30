(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; CLJ AND CLJS source code path
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2069"]
                 [compojure "1.1.6"]
                 [domina "1.0.3-SNAPSHOT"]]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "1.0.0"]
            [lein-ring "0.8.8"]]
  :ring {:handler modern-cljs.core/handler}

  ;; cljsbuild options configuration
  :cljsbuild
  {:builds

   ;; login.js build
   {:login
    {:source-paths ["src/cljs/login"]
     :compiler
     {:output-to "resources/public/js/login.js"
      :optimizations :whitespace
      :pretty-print true}}
    ;; shopping.js build
    :shopping
    {:source-paths ["src/cljs/shopping"]
     :compiler
     {:output-to "resources/public/js/shopping.js"
      :optimizations :whitespace
      :pretty-print true}}}})
