(ns lzw-clj.core-test
  (:require [clojure.test :refer :all]
            [lzw-clj.core :refer :all]))

(deftest lzw-clj.core-test
  (testing "FIXME, I fail."
    (is (= '(84 79 66 69 79 82 78 79 84 256 258 260 265 259 261 263) (compress "TOBEORNOTTOBEORTOBEORNOT")))))
