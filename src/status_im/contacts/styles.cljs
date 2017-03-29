(ns status-im.contacts.styles
  (:require-macros [status-im.utils.styles :refer [defnstyle]])
  (:require [status-im.components.styles :refer [text1-color
                                                 text2-color
                                                 text3-color
                                                 color-white
                                                 color-separator
                                                 color-gray2
                                                 color-gray4
                                                 color-blue
                                                 color-light-red
                                                 color-gray]]
            [status-im.components.toolbar.styles :refer [toolbar-background1 toolbar-background2]]
            [status-im.components.tabs.styles :as tabs-st]
            [status-im.utils.platform :as p]))

;; Contacts list

(def toolbar-actions
  {:flex-direction :row})

(def contact-groups
  {:flex             1
   :background-color toolbar-background2})

(defnstyle contacts-list-container [tabs-hidden?]
  {:flex    1
   :android {:margin-bottom 20}
   :ios     {:margin-bottom (if tabs-hidden? 20 (+ 16 tabs-st/tabs-height))}})

(def contacts-list
  {:background-color color-white})

(def contacts-list-modal
  {:background-color toolbar-background2})

(def empty-contact-groups
  (merge contact-groups
         {:align-items     :center
          :justify-content :center}))

(def empty-contacts-icon
  {:height 62
   :width  62})

(def empty-contacts-text
  {:margin-top 12
   :font-size  16
   :color      color-gray2})

(def contact-group
  {:flex-direction :column})

(def contact-group-count
  {:margin-left 8
   :opacity     0.6})

(def show-all
  (merge (get-in p/platform-specific [:component-styles :contacts :show-all])
         {:flexDirection   :row
          :alignItems      :center
          :backgroundColor color-white}))

(def show-all-text
  (get-in p/platform-specific [:component-styles :contacts :show-all-text]))


(def option-inner-image
  {:width  24
   :height 18
   :top    16
   :left   13})

(def group-icon
  (assoc option-inner-image
    :tint-color color-gray))

; New contact

(def contact-form-container
  {:flex            1
   :color           :white
   :backgroundColor :white})

(def gradient-background
  {:position :absolute
   :top      0
   :right    0
   :bottom   0
   :left     0})

(def form-container
  {:margin-left 16
   :margin-top  8
   :height      72})

(def address-explication-container
  {:flex         1
   :margin-top   30
   :paddingLeft  16
   :paddingRight 16})

(def address-explication
  {:textAlign :center
   :color     color-gray})

(def qr-input
  {:margin-right 42})

(def search-container
  {:flex             1
   :background-color color-white})

(def search-empty-view
  {:flex             1
   :background-color color-white
   :align-items      :center
   :justify-content  :center})
