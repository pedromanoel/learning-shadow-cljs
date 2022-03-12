(ns codes.pedromanoel.frontend.app)

(defn init []
  (println "Hello World!")
  (-> js/document
      (.getElementById "root")
      (.-innerHTML)
      (set! "Hello World")))
