package com.chefmic.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.support.v7.app.AlertDialog
import com.chefmic.learn_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.text = "Hello World from Activity";
        button.setOnClickListener {
            toast("You just clicked!")
        }
    }

    fun arrays(): Unit {
        var long_array: LongArray = longArrayOf(1L, 2L, 3L)
        var float_array: FloatArray = floatArrayOf(1.0f, 2.0f, 3.0f)
        var boolean_array: BooleanArray = booleanArrayOf(false, true, false)
        var string_array: Array<String> = arrayOf("Hello", "World")

        button.setOnClickListener {
            var str: String = ""
            var i: Int = 0
            while (i < string_array.size) {
                str = str + string_array[i++] + ", "
            }

            tv_hello.text = str
        }
    }

    fun collections(): Unit {
        // List
        val satellites: List<String> = listOf("Moon", "Earth", "Mars", "Pluto")

        // Set
        var immuteSet: Set<String> = setOf("A", "B", "C", "D")
        var muteSet: MutableSet<String> = mutableSetOf("E", "F", "G")

        var desc = ""
        for (item in muteSet) {
            desc = "${desc} ${item} \n"

        }
        tv_hello.text = desc
    }

    fun jumpToMainActivity(): Unit {
        val intent = Intent(this@MainActivity, MainActivity::class.java)
        startActivity(intent)

        startActivity<MainActivity>()

        startActivity<MainActivity>("request_time" to DateUtil.nowDateTime)

        startActivity<MainActivity>(Pair("request_time", DateUtil.nowDateTime))
    }

    fun showDeleteAlertDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Dear User")
                .setMessage("Do you really want to delete?")
                .setPositiveButton("Yes") { dialog, which ->
                    toast("See you!")
                }
                .setNegativeButton("No") { dialog, which ->
                    toast("YEAH!")
                }
        builder.create().show()

        alert("Do you really want to delete?", "Dear user") {
            positiveButton("Yes") { toast("See you") }
            negativeButton("No") { toast("Thanks") }
        }
    }

}
