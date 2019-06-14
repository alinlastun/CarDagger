package com.example.cardaggerexemple

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(var horsePower:Int): Engine {
    private val TAG = "testDrive"
    override fun start() {
        Log.d(TAG, "Diesel engine started. HorsePower: ${horsePower}")
    }
}