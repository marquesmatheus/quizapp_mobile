package com.profdata.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    private val loading:Long = 3000 //1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()


        } , loading)
    }
}
