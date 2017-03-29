(ns status-im.components.sticky-button
  (:require [status-im.components.styles :as st]
            [status-im.utils.platform :refer [platform-specific]]
            [status-im.components.react :refer [view
                                                text
                                                touchable-highlight]]))

(defn sticky-button [label on-press]
  [touchable-highlight {:on-press on-press}
   [view st/sticky-button
    [text {:style st/sticky-button-label
           :uppercase? (get-in platform-specific [:uppercase?])}
          label]]])