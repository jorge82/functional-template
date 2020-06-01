(ns exercise10)
(def account (agent {:balance nil}))
(defn open-account []

(await account)
  (send account assoc :balance 0)

)


(defn close-account [account]
(await account)
  (send account assoc :balance nil)

)

(defn get-balance [ account]
(await account)
(:balance @account)
)

(defn update-balance [account amount]
  (await account)
  (send account update :balance + amount)
)

