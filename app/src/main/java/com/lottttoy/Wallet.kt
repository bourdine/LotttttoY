package com.lottttoy

import android.util.Log

/**
 * Класс для представления кошелька пользователя
 */
class Wallet(private val address: String) {
    fun displayInfo() {
        Log.d(Config.APP_NAME, "Адресс кошелька: $address")
    }
}
