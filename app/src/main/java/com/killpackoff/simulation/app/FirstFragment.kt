package com.killpackoff.simulation.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.killpackoff.simulation.core.Fight
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

class FirstFragment @Inject constructor(val fight: Fight) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val bundle = Bundle()
            bundle.putString("String", "I am String")
            findNavController().navigate(R.id.action_FirstFragment_to_FightFragment, bundle)
        }
    }
}