//package com.killpackoff.fight.di
//
//import androidx.fragment.app.Fragment
//import com.killpackoff.fight.FightFragment
//import com.killpackoff.simulation.core.Core
//import dagger.Binds
//import dagger.MapKey
//import dagger.Module
//import dagger.multibindings.IntoMap
//import kotlin.reflect.KClass
//
///**
// * @author ma.kolpakov
// */
//@MustBeDocumented
//@Target(
//    AnnotationTarget.FUNCTION,
//    AnnotationTarget.PROPERTY_GETTER,
//    AnnotationTarget.PROPERTY_SETTER
//)
//@Retention(AnnotationRetention.RUNTIME)
//@MapKey
//annotation class FragmentKey(val value: KClass<out Fragment>)
//
//
//@Module
//abstract class FightModule {
//
//    @Binds
//    @IntoMap
//    @Core
//    @FragmentKey(FightFragment::class)
//    abstract fun fightFragment(fragment: FightFragment): Fragment
//}