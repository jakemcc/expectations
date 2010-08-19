(ns expectations-test
  (:use expectations))

;; k/v pair in map. matches subset
(expect {:foo 1} in {:foo 1 :cat 4}) 

;; key in set
(expect (identity :foo) in (conj #{:foo :bar} :cat)) 

;; number equality
(expect 2 (inc 1))

;; string equality
(expect "foo" "foo")

;; is the regex in the string
(expect #"foo" (str "boo" "foo" "ar"))

;; does the form throw an expeted exception
(expect ArithmeticException (/ 12 0))

;; verify the type of the result
(expect String "foo")

;; failures
;; (expect 3 (inc 1))

;; (expect 2 (/ 12 0))
