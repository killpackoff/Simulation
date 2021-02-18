package com.killpackoff.figth.creature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.killpackoff.simulation.core.SimpleCreature
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * @author ma.kolpakov
 */
class CreatureViewModel @Inject constructor( creture: SimpleCreature):ViewModel() {
    private var _turnLiveData = MediatorLiveData<Int>()
    var turnLiveData: LiveData<Int> = _turnLiveData
    init {
        viewModelScope.launch {
            creture.health.collect {
                _turnLiveData.value=it
            }
        }
    }
}