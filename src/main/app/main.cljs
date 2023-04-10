(ns app.main
(:require
           ["react" :as react]
           ["react-dom/client" :as react-dom]))

(defn init []
(println "React" react-dom)
    (let [app-node (.getElementById js/document "root")
  root (react-dom/createRoot app-node)
  ]
    (.render root "Hello World!")))

;; (main)
