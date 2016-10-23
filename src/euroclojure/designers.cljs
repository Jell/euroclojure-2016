(ns euroclojure.designers)

(defn slide [{:keys [speaker]}]
  [:div.slide.left
   (when speaker
     [:div "I've personally worked with 3 types of designers, so here
     are ideas on how to empower them"])
   [:h1.centered "Working with Designers"]
   [:ul

    [:li [:b "Profile 1: "] "Wants to work with PhotoShop"]
    [:em "Templates: "] "Reagent"
    [:br]
    [:em "Lingua Franca: "] "Visual Mockups"
    (when speaker
      [:div
       [:span "Pros: Minimal tooling"]
       [:br]
       [:span "Cons: All implementation done by developers"]])

    [:li [:b "Profile 2:"] " Wants to participate in implementation"]
    [:em "Templates: "] "Kioo"
    [:br]
    [:em "Lingua Franca: "] "HTML"
    (when speaker
      [:div
       [:span "Pros: designer comfort zone, hit the ground running"]
       [:br]
       [:span "Cons: can't use react libraries directly"]])

    [:li [:b "Profile 3:"] " Wants full-control, but doesn't want to deal with Cljs"]
    [:em "Templates: "] "JSX"
    [:br]
    [:em "Lingua Franca: "] "JSX / JavaScript"
    (when speaker
      [:div
       [:span "Pros: use React libs directly, modular & reusable components"]
       [:br]
       [:span "Cons: lot more tooling, designers need to deal with JS modules & JSX syntax"]])

    ]])
