(ns clojure.core.matrix.test-pprint
  (:use clojure.test)
  (:use clojure.core.matrix)
  (:require [clojure.core.matrix.impl.pprint :as pp]))

(deftest test-basic-pprint
  (is (= "[1.000 2.000]" (pp/pm [1 2]))))

(deftest test-vectorz-pm
  (is (pp/pm (array :vectorz [1 2])))
  (is (pp/pm (array :vectorz [[1 2] [3 4]])))
  (is (pp/pm (array :vectorz [[[1 2] [3 4]] [[5 6] [7 8]]]))))

(deftest test-non-numeric
  (is (= "[:a foo bar  ]" (pp/pm [:a "foo" 'bar \space]))))