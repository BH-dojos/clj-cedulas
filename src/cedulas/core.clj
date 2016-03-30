(ns cedulas.core)

(defn maximo [valor]
	(cond
		(= valor 1) 0
		(= valor 3) 0
		:else (/ valor 2)))

(defn minimo [valor]
	(cond
		(= valor 2) 1
		(= valor 5) 1
		(= valor 10) 1
		(= valor 20) 1
		(= valor 50) 1
		(= valor 100) 1
		))