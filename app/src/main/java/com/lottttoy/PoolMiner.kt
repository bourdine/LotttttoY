package com.lottttoy

import android.util.Log

/**
 * Класс для майнинга в пуле
 */
class PoolMiner(private val poolUrl: String, private val walletAddress: String) {
    fun start() {
        Log.d(Config.APP_NAME, "Начинаем майнинг в пуле: $poolUrl, Адрес кошелька: $walletAddress")
        startMining(poolUrl, walletAddress)
    }
}
