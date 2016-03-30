(ns cedulas.core-test
  (:require [midje.sweet :refer :all]
            [cedulas.core :refer :all]))

(fact "saca o máximo 120 cédulas de um real para um valor de 240 reais"
	(maximo 240) => 120)

(fact "não saca nada quando o é um"
	(maximo 1) => 0)

(fact "não saca nada quando o é três"
	(maximo 3) => 0)

(fact "se o valor e uma cedula, minimo e um"
	(minimo 2) => 1
	(minimo 5) => 1
	(minimo 10) => 1
	(minimo 20) => 1
	(minimo 50) => 1
	(minimo 100) => 1)