@file:Suppress("DEPRECATION")

package com.rezaharis.javanesefood

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar

class Splash : Activity() {

    private val length = 3000
    private var spinner: ProgressBar? = null

    public override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.splash_screen)
        spinner = findViewById<View>(R.id.progressBar1) as ProgressBar
        Handler().postDelayed({
            val mainIntent = Intent(this@Splash, MainActivity::class.java)
            this@Splash.startActivity(mainIntent)
            finish()
        }, length.toLong())
    }
}
