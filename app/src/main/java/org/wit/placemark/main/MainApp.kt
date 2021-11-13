package org.wit.placemark.main

import android.app.Application
import org.wit.placemark.models.PlacemarkJSONStore
import org.wit.placemark.models.PlacemarkMemStore
import org.wit.placemark.models.PlacemarkStore
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    // rework to use PlaceMarkMemStore
//    val placemarks = PlacemarkMemStore()
    lateinit var placemarks: PlacemarkStore
    //val placemarks = ArrayList<PlacemarkModel>()


    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        placemarks = PlacemarkJSONStore(applicationContext)
        i("Placemark started")

    }
}
