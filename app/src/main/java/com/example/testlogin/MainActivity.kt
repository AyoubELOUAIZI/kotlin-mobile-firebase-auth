package com.example.testlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase // Add this import

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write a message to the database
        val database = FirebaseDatabase.getInstance() // Use getInstance() instead of Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")
    }
}
