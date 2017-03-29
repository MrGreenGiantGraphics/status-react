(ns status-im.components.contact.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.components.styles :as common]))

(defstyle contact-inner-container
  {:flex            1
   :flexDirection   :row
   :align-items     :center
   :padding-left    16
   :backgroundColor common/color-white
   :android         {:height 56}
   :ios             {:height 63}})

(def info-container
  {:flex           1
   :flexDirection  :column})

(defstyle name-text
  {:color   common/text1-color
   :android {:fontSize       16
             :line-height    24}
   :ios     {:fontSize       17
             :line-height    20
             :letter-spacing -0.2}})

(def info-text
  {:marginTop 1
   :fontSize  12
   :color     common/text2-color})

(def contact-container
  {:flex-direction   :row
   :align-items      :center
   :background-color common/color-white
   :padding-right    16})

(def more-btn
  {:width          24
   :height         24
   :alignItems     :center
   :justifyContent :center})
