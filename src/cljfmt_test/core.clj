(ns cljfmt-test.core
  (:require [slingshot.slingshot :refer [try+]]))

(defn foo
  "I don't do a whole lot."
  [x]
  (try+ (println x "Hello, World!")
    (catch Exception e
      (println "uh oh:" (.getMessage e)))))
