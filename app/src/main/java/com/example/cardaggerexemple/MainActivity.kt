package com.example.cardaggerexemple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cardaggerexemple.component.DaggerCarComponent
import com.example.cardaggerexemple.module.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        component.inject(this)
        car.drive()
    }
}
