package com.example.counters

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    var count = 0
    var color = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = findViewById<TextView>(R.id.tvCount)
        counter.text = count.toString()


        var add = findViewById<FloatingActionButton>(R.id.fabAdd)
        add.setOnClickListener {
            ++count
            if (count > 0) {
                color = R.color.positive

            }
            counter.setTextColor(ContextCompat.getColor(this, color))
            counter.text = count.toString()



        }
        var minus = findViewById<FloatingActionButton>(R.id.fabMinus)
        minus.setOnClickListener {
            --count
            if (count < 0) {
                color = R.color.negative

            }
            counter.setTextColor(ContextCompat.getColor(this, color))
            counter.text = count.toString()



        }
        var reset = findViewById<Button>(R.id.btnReset)
        reset.setOnClickListener {
            count = 0
            if (count == 0) {
                color = R.color.zero

            }
            counter.setTextColor(ContextCompat.getColor(this, color))
            counter.text = count.toString()


        }
    }
}


    /*private fun counterColor(count: Int) {
        var color = 0
        when{
            count < 0 ->{
                color = R.color.negative
            }
            count == 0 ->{
                color = R.color.zero
            }
            count > 0 ->{
                color = R.color.positive
            }
        }
        counter.setTextColor(ContextCompat.getColor(this,color))
    }

}*/
