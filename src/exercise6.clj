(ns exercise6)

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (/ (apply + x) (count x))
                  )




