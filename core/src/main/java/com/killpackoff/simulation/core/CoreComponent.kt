package com.killpackoff.simulation.core

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Qualifier
import javax.inject.Scope
import javax.inject.Singleton

/**
 * @author ma.kolpakov
 */

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class Core


@Core
@Component(modules = [CoreModule::class])
interface CoreComponent {
//    fun inject(fight:Fight)
}

@Module
 class CoreModule {
//    @Singleton
//    @Provides
//     fun fight(creature1: ICreature, creature2: ICreature): Fight{
//         return Fight(creature1,creature2)
//     }

    @Core
    @Named("creatureA")
    @Provides
    fun creatureA(): ICreature = SimpleCreature()

    @Core
    @Named("creatureB")
    @Provides
    fun creatureB(): ICreature = SimpleCreature()
}

