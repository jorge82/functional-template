(ns exercise9)


(defn filter-letters
[x]
(apply str (filter #(or (Character/isLetter %) (= % \space )  (Character/isDigit %) ) x)))


(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (frequencies (clojure.string/split  (clojure.string/lower-case  (filter-letters x)) #"\s+"))

)




