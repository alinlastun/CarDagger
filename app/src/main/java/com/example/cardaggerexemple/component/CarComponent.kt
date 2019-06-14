package com.example.cardaggerexemple.component

import com.example.cardaggerexemple.MainActivity
import com.example.cardaggerexemple.module.PetrolEngineModule
import com.example.cardaggerexemple.module.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [WheelsModule::class,PetrolEngineModule::class])
interface CarComponent {

     fun inject(mainActivity: MainActivity)

     @Component.Builder
     interface Builder{

          @BindsInstance
          fun horsePower(@Named("horse")horsepower: Int):Builder

          @BindsInstance
          fun engineCapacity(@Named("capacity")engineCapacity: Int):Builder

          fun build():CarComponent

     }
}