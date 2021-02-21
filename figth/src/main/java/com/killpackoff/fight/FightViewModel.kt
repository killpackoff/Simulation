package com.killpackoff.fight

import androidx.lifecycle.*
import com.killpackoff.simulation.core.Fight
import javax.inject.Inject

/**
 * @author ma.kolpakov
 */
class FightViewModel @Inject constructor(private val fight: Fight) : ViewModel() {
    private var _turnLiveData = MutableLiveData<String>()
    var turnLiveData: LiveData<String> = _turnLiveData

    var health: LiveData<Int> = fight.creatureA.health.asLiveData()

    init {
        _turnLiveData.value = fight.turnCount.toString()
    }

    fun doTurn() {
        fight.turn()
        _turnLiveData.value = fight.turnCount.toString()
    }

}