package com.killpackoff.simulation.core

import javax.inject.Inject

class CreatureVM @Inject constructor(private val creature: ICreature) {
    fun print() {
        println("[${creature.name}] - health ${creature.health}")
    }
}