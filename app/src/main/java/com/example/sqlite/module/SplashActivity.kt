package com.example.sqlite.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sqlite.Constants.DELAY_SPLASH
import com.example.sqlite.R
import com.example.sqlite.module.employee.HomeActivity

class SplashActivity : AppCompatActivity() {
    private val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler.postDelayed({
            goToHomeActivity()
        },DELAY_SPLASH)
    }

    /**
     * This method is used to navigate on home screen
     */
    private fun goToHomeActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
