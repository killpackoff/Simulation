package com.killpackoff.figth.creature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.killpackoff.figth.FightActivity
import com.killpackoff.figth.R
import com.killpackoff.figth.databinding.CreatureViewBinding
import com.killpackoff.simulation.core.ICreature
import javax.inject.Inject

/**
 * @author ma.kolpakov
 */
class CreatureFragment : Fragment() {
    @Inject
    lateinit var viewModel : CreatureViewModel

    lateinit var viewBinding: CreatureViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = CreatureViewBinding.inflate(layoutInflater)
        viewModel.turnLiveData.observe(this){
            viewBinding.creatureHalthText.text = it.toString()
            viewBinding.progressBar.progress = it
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return viewBinding.root
    }
}