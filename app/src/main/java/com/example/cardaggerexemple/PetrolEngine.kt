package com.example.cardaggerexemple

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse")var horsePower:Int,@Named("capacity") var engineCapacity:Int): Engine  {

    private val TAG = "testDrive"
    override fun start() {
        Log.d(TAG, "Petrol engine started. " +
                "\nHorsePower: ${horsePower}" +
                "\nEngine capacity: ${engineCapacity}")
    }
}