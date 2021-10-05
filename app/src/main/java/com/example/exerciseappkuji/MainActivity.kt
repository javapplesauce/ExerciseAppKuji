package com.example.exerciseappkuji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createNewJournal(view: View)
    {
        val TextView  = findViewById<TextView>(R.id.CreateNewJournal)
        var message = TextView.text.toString()
        intent = Intent(this, DisplayMessageActivity::class.java).apply
        {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    private fun putExtra(extraMessage: String, message: String): Any {

    }

    fun addToExistingJournal(view: View)
    {

    }

}