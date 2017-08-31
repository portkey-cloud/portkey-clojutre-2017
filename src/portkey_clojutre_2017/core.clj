(ns portkey-clojutre-2017.core)

(defn welcome []
  "Hello ClojuTre!\n")

(defn hello [name]
  (str name " is " (rand-nth ["incredible" "awesome" "fantastic"])))

(def visitor-count (atom 0))

(defn welcome [name]
  (str "Hello ClojuTre!\n" "Visitor count is: " (swap! visitor-count inc)))

