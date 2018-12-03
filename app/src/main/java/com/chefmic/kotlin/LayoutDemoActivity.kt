package com.chefmic.kotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_layout_demo.*
import org.jetbrains.anko.dip
import org.jetbrains.anko.sp

class LayoutDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_demo)

        ll_margin.orientation = LinearLayout.HORIZONTAL
        ll_margin.gravity = Gravity.CENTER

        ll_margin.setOnClickListener{
            val params = ll_margin.layoutParams as LinearLayout.LayoutParams
            params.setMargins(0, dip(50), 0, dip(50))
            ll_margin.layoutParams = params
        }

        text.text = "Hello World"
        text.textSize = sp(12).toFloat()
        text.setTextColor(Color.BLACK)
        text.gravity = Gravity.START or Gravity.CENTER
        text.ellipsize = TextUtils.TruncateAt.MARQUEE
    }
}
