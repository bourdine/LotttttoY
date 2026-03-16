package com.lottttoy

object MinerUtils {
    /**
     * Преобразует строку адреса пула в корректный формат для XMRig
     */
    fun formatPoolUrl(url: String): String {
        return url.trim().lowercase()
    }

    /**
     * Проверяет корректность введённого адреса кошелька
     */
    fun validateWalletAddress(address: String): Boolean {
        return address.matches("[48][0-9AB][1-9A-HJ-NP-Za-km-z]{93}".toRegex())
    }
}
