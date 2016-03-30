(ns cedulas.core)

(defn maximo [valor]
	(cond
		(= valor 1) 0
		(= valor 3) 0
		:else (/ valor 2)))

(defn minimo [valor]
	(= (contains? [2 5 10 20 50 100] valor) true) 1)