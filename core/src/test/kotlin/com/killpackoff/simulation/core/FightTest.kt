package com.killpackoff.simulation.core

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test


/**
 * @author ma.kolpakov
 */
internal class FightTest {
    @Test
    fun turn() {
        val component = DaggerCoreComponent.create()
        val fight = component.fight()
        val activity = component.activity()
        runBlocking {
            for (i in 1..20) {
                println(fight.turnCount)
                delay(1000)
                fight.turn()
            }
        }
    }


}
