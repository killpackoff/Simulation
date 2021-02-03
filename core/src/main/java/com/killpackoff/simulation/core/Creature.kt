package com.killpackoff.simulation.core

import javax.inject.Inject
import kotlin.properties.Delegates

abstract class ICreature {
   open var health by Delegates.observable(100) { _, _, new ->
        healthData?.invoke(new)
    }

    var healthData: ((Int) -> Unit)? = null

    abstract fun getAttackCommand(): AttackCommand
}

/**
 * @author ma.kolpakov
 */

class SimpleCreature @Inject constructor() : ICreature() {
    override fun getAttackCommand(): AttackCommand {
        return SimpleAttack()
    }
}

interface AttackCommand {
    fun apply(creature: ICreature)
}

class SimpleAttack : AttackCommand {
    override fun apply(creature: ICreature) {
        creature.health -= 10
    }

}
