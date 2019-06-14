package com.example.cardaggerexemple.module

import com.example.cardaggerexemple.Engine
import com.example.cardaggerexemple.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class   PetrolEngineModule(var horsePower:Int) {

    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine):Engine


}