package com.example.lyodsappone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activiy)
        Log.i("mytag", "SecondActivty created")

var resultTextView = findViewById<TextView>(R.id.textViewResult)
        resultTextView.setOnClickListener {
            var myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
//      var result =  intent.extras?.getString("un")
//        resultTextView.setText(result)


    }


    override fun onStart() {
        super.onStart()
        Log.i("mytag", "SecondActivty start")

    }

    override fun onResume() {
        super.onResume()
        Log.i("mytag", "SecondActivty resume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag", "SecondActivty pause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "SecondActivty stop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "SecondActivty restart")

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "SecondActivty destroyed")

    }
}