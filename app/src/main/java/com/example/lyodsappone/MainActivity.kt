package com.example.lyodsappone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// Testing
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("mytag", "Entered in Acctity")
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        Log.i("mytag", "MainActivity created")

        var myimage = findViewById<ImageView>(R.id.imageViewMenu)
        registerForContextMenu(myimage)



        var submitButton = findViewById<Button>(R.id.buttonSubmit)

        Log.i("mytag", "Found submit button")
        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsername)

        submitButton.setOnClickListener {
            Log.i("mytag", "Button  clicked")
            var username = usernameEditText.text.toString()

                  }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var showMenu = menuInflater.inflate(R.menu.mymenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var myItemId = item.itemId

        if(myItemId == R.id.itemToast){
            Toast.makeText(this, "Option Menu Toast", Toast.LENGTH_LONG).show()
            return  true
        }


        return true
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        var myContextMenu = menuInflater.inflate(R.menu.mymenu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
    }




}