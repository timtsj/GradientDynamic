package com.example.gradientdynamic

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var drawableAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawableAnimation = mainView.background as AnimationDrawable

        drawableAnimation.setEnterFadeDuration(5000)
        drawableAnimation.setExitFadeDuration(2000)

        supportActionBar?.hide()
    }

    override fun onStart() {
        super.onStart()
        drawableAnimation.start()
    }
}