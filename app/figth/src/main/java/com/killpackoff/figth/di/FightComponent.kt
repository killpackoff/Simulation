//package com.killpackoff.figth.di
//
//import com.killpackoff.figth.FightActivity
//import com.killpackoff.figth.FightViewModel
//import com.killpackoff.figth.creature.CreatureFragment
//import com.killpackoff.simulation.core.Fight
//import dagger.Module
//import dagger.Provides
//import dagger.Subcomponent
//import javax.inject.Scope
//
///**
// * @author ma.kolpakov
// */
//
//@Scope
//@Retention(value = AnnotationRetention.RUNTIME)
//annotation class FightScope
//
//@FightScope
//@Subcomponent(modules = [FightModule::class])
//interface FightComponent {
//
//    @Subcomponent.Builder
//    interface Factory {
//        fun create(): FightComponent
//    }
//
//    fun inject(activity: FightActivity)
//}
//
//@Module
//class FightModule {
//    @FightScope
//    @Provides
//    fun fightViewModel(fight: Fight): FightViewModel {
//        return FightViewModel(fight)
//    }
//}
//
//@Module(subcomponents = [FightComponent::class])
//class FightSubComponentModule {}
