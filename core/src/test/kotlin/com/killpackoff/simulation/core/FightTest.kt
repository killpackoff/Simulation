package com.killpackoff.simulation.core

import org.junit.Assert
import org.junit.Test


/**
 * @author ma.kolpakov
 */
internal class FightTest {
    @Test
    fun turn() {

        val fight = Fight().apply {
            this.creatureA=creatureA
            this.creatureB=creatureB
        }
        fight.turn()
//        Assert.assertEquals(100, creatureA.health)
//        Assert.assertEquals(90, creatureB.health)
//        fight.turn()
//        Assert.assertEquals(90, creatureA.health)
//        Assert.assertEquals(90, creatureB.health)
    }


}