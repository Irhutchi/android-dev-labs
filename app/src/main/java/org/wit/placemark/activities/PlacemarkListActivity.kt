package org.wit.placemark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.wit.placemark.R
import org.wit.placemark.main.MainApp

class PlacemarkListActivity : AppCompatActivity() {

    // retrieving and storing a reference to the MainApp object (for future use)
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark_list)
        app = application as MainApp
    }
}