(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (x)
    (true)
    (false))
  )

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x
    )
  )

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false
    )
  )

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""
     )
  )

(defn teen? [age]
  (if (<= 13 age 19)
    (true)
    (false)
    )
  )


(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
