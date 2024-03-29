package com.example.cardaggerexemple.module

import com.example.cardaggerexemple.Rims
import com.example.cardaggerexemple.Tires
import com.example.cardaggerexemple.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
     fun provideRims(): Rims{
        return Rims()
    }

    @Provides
     fun provideTires(): Tires{
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims,tires: Tires):Wheels{
        return Wheels(rims,tires)
    }
}