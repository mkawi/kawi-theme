(ns hello.world.clojure)

(defn sum [& numbers]
    (if (empty? numbers)
        0
        (reduce + 0 numbers)))

(defn print-name [{:keys [first last age]}]
    (println (str "Your name is " first " " last " and you are " age " years old.")))

(defn set-age [person new-age]
    (assoc person :age new-age))

(defn hello-world []
    (let [john {:first "John" :last "Smith" :age 65}
        jack {:first "Jack" :last "Road" :age 76}
        george {:first "George" :last "Way" :age 23}
        george-junior (assoc george :age 6)
        all-persons [john jack george george-junior]]

    (doseq [person all-persons]
        (print-name person))

    (println (str "Total age is: " (apply sum (map :age all-persons))))))

(hello-world)

(defn vector
    "Creates a new vector containing the args."
    {   :added "1.0"
        :static true}
    ([] [])
    ([a] [a])
    ([a b] [a b])
    ([a b c] [a b c])
    ([a b c d] [a b c d])
    ([a b c d e] [a b c d e])
    ([a b c d e f] [a b c d e f])
    ([a b c d e f & args]
        (. clojure.lang.LazilyPersistentVector (create (cons a (cons b (cons c (cons d (cons e (cons f args))))))))))
