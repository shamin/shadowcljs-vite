(ns app.main
  (:require
   [app.page.components :refer [less-heading]]
   [reagent.dom :as rd]))


(defn main-component []
  [:div
   [:h1.text-3xl.font-bold.underline "Tailwind heading"]
   [less-heading]])


(defn init []
  (rd/render [main-component] (.getElementById js/document "root")))
