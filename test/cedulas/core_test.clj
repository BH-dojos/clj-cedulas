(ns cedulas.core-test
  (:require [midje.sweet :refer :all]
            [cedulas.core :refer :all]))

(fact "máximo 240 e 120"
	(maximo 240) => 120)

(fact "maximo de 1 e 0"
	(maximo 1) => 0)

(fact "maximo de 3 e 0"
	(maximo 3) => 0)

(fact "minimo de 1 e 0"
	(minimo 1) => 0)

(fact "minimo de 9 e 3"
	(minimo 9) => 3)

;(fact "minimo de 3 e 0"
;	(maximo 3) => 0)


(fact "se o valor e uma cedula, minimo e um"
	(minimo 2) => 1
	(minimo 5) => 1
	(minimo 10) => 1
	(minimo 20) => 1
	(minimo 50) => 1
	(minimo 100) => 1)

;(fact "minimo de 25 e 2"
;	(minimo 25) => 2)