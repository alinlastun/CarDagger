package com.example.cardaggerexemple

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car){
        Log.d("testDrive", "Remote connected")
    }

}
