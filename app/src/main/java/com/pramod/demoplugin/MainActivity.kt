package com.pramod.demoplugin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demoPlugin = com.pramod.DemoPlugin()
        val result = demoPlugin.multiply(10,20)
        txtText.text = "Multiplication is: $result"

    }
}