package com.killpackoff.simulation.core

import org.junit.Assert
import org.junit.Test


/**
 * @author ma.kolpakov
 */
internal class FightTest {
    @Test
    fun turn() {
        val creatureA = SimpleCreature()
        val creatureB = SimpleCreature()
        val fight = Fight(creatureA, creatureB)
        fight.turn()
        Assert.assertEquals(100f, creatureA.health)
        Assert.assertEquals(90f, creatureB.health)
        fight.turn()
        Assert.assertEquals(90f, creatureA.health)
        Assert.assertEquals(90f, creatureB.health)
    }

    @Test
    fun turnDI() {
        val simpleFight = DaggerCoreComponent.create().simple()
        simpleFight.turn()
        Assert.assertEquals(100f, simpleFight.creatureA.health)
        Assert.assertEquals(90f, simpleFight.creatureB.health)
        simpleFight.turn()
        Assert.assertEquals(90f, simpleFight.creatureA.health)
        Assert.assertEquals(90f, simpleFight.creatureB.health)
    }
}