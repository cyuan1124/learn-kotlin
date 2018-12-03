package com.chefmic.kotlin

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_change_text.setOnClickListener { text_view.text = System.currentTimeMillis().toString() }
        btn_change_text.setOnLongClickListener {
            longToast("Whooooo")
            true
        }
    }

    fun longClickButton(): Boolean {
        longToast("Long clicked!")
        return true
    }

    fun startLayoutDemoActivity() {
        // 1
        val intent = Intent(this@MainActivity, LayoutDemoActivity::class.java)
        startActivity(intent)

        // 2
        startActivity<LayoutDemoActivity>(
                "request_time" to SystemClock.currentThreadTimeMillis(),
                Pair("request_content", "HelloWorld")
        )

    }

}
