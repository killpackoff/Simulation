package com.killpackoff.figth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.killpackoff.figth.di.FightScope
import com.killpackoff.simulation.core.Fight
import javax.inject.Inject

/**
 * @author ma.kolpakov
 */
@FightScope
class FightViewModel @Inject constructor(private val fight: Fight) : ViewModel() {

    init {
        fight.turnData = ::updateTurn
    }

    private var _turnLiveData = MediatorLiveData<Int>()
    var turnLiveData: LiveData<Int> = _turnLiveData

    private fun updateTurn(count: Int) {
        _turnLiveData.value = count
    }

    fun doTurn() {
        fight.turn()
    }

}