(ns app.main
  (:require 
   [reagent.dom :as rd]))


(defn main-component []
  [:h1.text-3xl.font-bold.underline "Hello world!"])


(defn init []
  (rd/render [main-component] (.getElementById js/document "root")))
