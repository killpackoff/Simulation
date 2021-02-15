package com.killpackoff.simulation.core

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Named

class CreatureVM @Inject constructor(private val creature: ICreature) {
    init {
        CoroutineScope(Dispatchers.IO).launch{
            creature.health.collect {
                println("[${creature.name}] - health ${it}")
            }
        }
    }
    fun print() {
    }
}

class Activity @Inject constructor(
    @Named("VM1") private val vm1: CreatureVM,
    @Named("VM2") private val vm2: CreatureVM
) {
}