package com.lottttoy

import android.util.Log

/**
 * Класс для выполнения майнинга в отдельном потоке
 */
class Worker(private val miner: Runnable) : Thread() {
    override fun run() {
        Log.d(Config.APP_NAME, "Запущен рабочий поток майнинга")
        miner.run()
    }
}
