package com.killpackoff.simulation.core

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named
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
//    fun inject():Fight
}

@Module
class CoreModule {
    @Singleton
    @Provides
    fun fight(
        @Named("creatureA") creature1: ICreature,
        @Named("creatureA") creature2: ICreature
    ): Fight {
        return Fight(creature1, creature2)
    }

    @Core
    @Named("creatureA")
    @Provides
    fun creatureA(): ICreature = SimpleCreature("Вася")

    @Core
    @Named("creatureB")
    @Provides
    fun creatureB(): ICreature = SimpleCreature("Петя")

    @Core
    @Named("VM1")
    @Provides
    fun vm1(@Named("creatureA") creature: ICreature): CreatureVM = CreatureVM(creature)

    @Core
    @Named("VM2")
    @Provides
    fun vm2(@Named("creatureB") creature: ICreature): CreatureVM = CreatureVM(creature)


}

