package jp.techacademy.yoshiyuki.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("よしゆき", 42, "kotlin")      // Humanのインスタンスを作る

        human.say()
        human.think()
    }
}
