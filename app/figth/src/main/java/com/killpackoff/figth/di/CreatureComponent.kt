//package com.killpackoff.figth.di
//
//import com.killpackoff.figth.creature.CreatureFragment
//import com.killpackoff.figth.creature.CreatureViewModel
//import com.killpackoff.simulation.core.ICreature
//import com.killpackoff.simulation.core.SimpleCreature
//import dagger.Module
//import dagger.Provides
//import dagger.Subcomponent
//import org.jetbrains.annotations.NotNull
//import javax.inject.Scope
//
///**
// * @author ma.kolpakov
// */
//
//
////@CreatureScope
////@Subcomponent(modules = [CreatureFragmentModule::class])
////interface CreatureComponent {
////
////    @Subcomponent.Factory
////    interface Factory {
////        fun create(@NotNull creature: ICreature): CreatureComponent
////    }
////
////    fun inject(fragment: CreatureFragment)
////}
//
//@Module
//class CreatureFragmentModule {
////    @CreatureScope
//    @FightScope
//    @Provides
//    fun creatureViewModel(creature: SimpleCreature): CreatureViewModel {
//        return CreatureViewModel(creature)
//    }
//}
//
////@Module(subcomponents = [CreatureComponent::class])
////class CreatureSubComponentModule {
////
////}