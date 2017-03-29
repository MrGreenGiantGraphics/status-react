(ns status-im.components.contact.contact
  (:require [status-im.components.react :refer [view icon touchable-highlight text]]
            [status-im.components.chat-icon.screen :refer [contact-icon-contacts-tab]]
            [status-im.components.context-menu :refer [context-menu]]
            [status-im.components.contact.styles :as st]
            [status-im.utils.gfycat.core :refer [generate-gfy]]
            [status-im.i18n :refer [get-contact-translated label]]))

(defn contact-photo [contact]
  [view
   [contact-icon-contacts-tab contact]])

(defn contact-inner-view
  ([{:keys [info style] {:keys [whisper-identity name] :as contact} :contact}]
   [view (merge st/contact-inner-container style)
    [contact-photo contact]
    [view st/info-container
     [text {:style           st/name-text
            :number-of-lines 1}
      (if (pos? (count (:name contact)))
        (get-contact-translated whisper-identity :name name)
        ;;TODO is this correct behaviour?
        (generate-gfy))]
     (when info
       [text {:style st/info-text}
        info])]]))

(defn contact-view [{:keys [contact extended? on-press extend-options info]}]
  [touchable-highlight (when-not extended?
                         {:on-press (when on-press #(on-press contact))})
   [view
    [view st/contact-container
     [contact-inner-view {:contact contact :info info}]
     (when extended?
       [view st/more-btn
        [context-menu
         [icon :options_gray]
         extend-options]])]]])

