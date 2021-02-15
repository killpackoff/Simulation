package com.killpackoff.simulation.core

import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

abstract class ICreature (val name:String){

    var health = MutableStateFlow(100)

    abstract fun getAttackCommand(): AttackCommand
}

/**
 * @author ma.kolpakov
 */

class SimpleCreature @Inject constructor(name: String) : ICreature(name) {
    override fun getAttackCommand(): AttackCommand {
        return SimpleAttack()
    }
}

interface AttackCommand {
    fun apply(creature: ICreature)
}

class SimpleAttack : AttackCommand {
    override fun apply(creature: ICreature) {
        creature.health.value -= 10
    }

}
