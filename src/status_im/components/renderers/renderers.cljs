(ns status-im.components.renderers.renderers
  (:require [status-im.components.react :refer [view list-item]]
            [status-im.components.common.common :as common]
            [status-im.components.renderers.styles :as st]))

(defn list-separator-renderer [_ row-id _]
  (list-item
    ^{:key row-id}
    [common/list-separator]))

(defn list-header-renderer [& _]
  (list-item [common/list-header]))

(defn list-footer-renderer [& _]
  (list-item [common/list-footer]))
