package com.example.cardaggerexemple.module

import com.example.cardaggerexemple.DieselEngine
import com.example.cardaggerexemple.Engine
import com.example.cardaggerexemple.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule (var horsePower:Int){

    @Provides
     fun provideEngine(dieselEngine: DieselEngine):Engine{
        return dieselEngine
    }




}