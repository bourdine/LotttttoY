package com.lottttoy

import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.content.Context
import android.util.Log

/**
 * Класс для проверки сетевого подключения
 */
object Network {
    fun isConnected(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork ?: return false
        val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
        return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
    }
}
