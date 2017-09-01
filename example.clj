(defn welcome []
  "Hello ClojuTre!\n")

(require '[portkey.core :as pk])

(defn hello [name]
  (str name " is " (rand-nth ["incredible" "awesome" "fantastic"])))

(def visitor-count (atom 0))

(defn welcome [name]
  (str "Hello ClojuTre!\n" "Visitor count is: " (swap! visitor-count inc)))
