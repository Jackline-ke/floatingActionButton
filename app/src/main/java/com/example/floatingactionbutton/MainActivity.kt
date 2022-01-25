package com.example.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //declare a variable
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavView.background = null
        bottomNavView.menu.getItem(2).isEnabled = false

        //creating a toast
        floatingActionButton = findViewById(R.id.fab)
        floatingActionButton.setOnClickListener {
            Toast.makeText(this, "FloatingActionButton", Toast.LENGTH_SHORT).show()
        }
    }
}