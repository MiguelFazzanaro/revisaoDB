package com.example.a0712

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var scope = CoroutineScope(Dispatchers.Main)

        scope.launch {
            delay(2000)
            startActivity(Intent(this@Splash, MainActivity::class.java))
            finish()
        }
    }
}