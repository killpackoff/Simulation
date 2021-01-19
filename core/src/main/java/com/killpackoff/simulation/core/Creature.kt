package com.killpackoff.simulation.core

import javax.inject.Inject


interface ICreature {
    var health: Float
    fun getAttackCommand(): AttackCommand
}

/**
 * @author ma.kolpakov
 */

class SimpleCreature  constructor(override var health: Float = 100f) : ICreature {
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
