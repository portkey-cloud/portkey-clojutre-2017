(defn welcome []
  "Hello ClojuTre! Visit: http://repl.portkey.cloud/welcome")

(require '[portkey.core :as pk])

(pk/mount! welcome "/welcome")

(require '[hiccup2.core :as h])

(defn welcome []
  (h/html
    [:body
     [:h1 "Hello ClojuTre!"]
     [:h2 "Visit http://repl.portkey.cloud/welcome"]]))

(pk/mount! welcome "/welcome"
           :content-type "text/html"
           :live true)

(def visitor-count (atom 0))

(defn welcome []
  (h/html
    [:body
     [:h1 "Hello ClojuTre!"]
     [:h2 "Visit http://repl.portkey.cloud/welcome"]
     [:h2 (str "Visitor count: " (swap! visitor-count inc))]]))
