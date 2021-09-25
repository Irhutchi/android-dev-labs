package org.wit.placemark.models

import timber.log.Timber.i

// This performs encapsulation of our list of placemarks.
class PlacemarkMemStore : PlacemarkStore {

    val placemarks = ArrayList<PlacemarkModel>()

    override fun findAll(): List<PlacemarkModel> {
        return placemarks
    }

    override fun create(placemark: PlacemarkModel) {
        placemarks.add(placemark)
        logAll()
    }

    // Log all placemarks
    fun logAll() {
        placemarks.forEach{ i("${it}") }
    }
}