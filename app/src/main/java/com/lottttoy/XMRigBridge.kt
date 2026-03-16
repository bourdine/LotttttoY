package com.yourcompany.LotttttoY

class XMRigBridge {
    external fun startMining(poolUrl: String, wallet: String)

    companion object {
        init {
            System.loadLibrary("xmrig")
        }
    }
}
