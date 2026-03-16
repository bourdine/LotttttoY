package com.lottttoy

import android.util.Log

/**
 * Класс для соло-майнинга
 */
class SoloMiner(private val nodeUrl: String, private val walletAddress: String) {
    fun start() {
        Log.d(Config.APP_NAME, "Начинаем соло-майнинг на узле: $nodeUrl, Адрес кошелька: $walletAddress")
        startMining(nodeUrl, walletAddress)
    }
}
