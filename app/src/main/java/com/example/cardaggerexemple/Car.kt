package com.example.cardaggerexemple

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, wheels: Wheels) {

    private val TAG = "testDrive"

    fun drive(){
        engine.start()
        Log.d(TAG,"Drive...")
    }

    @Inject
    fun enableRemote(remote:Remote){
        remote.setListener(this)
    }

}