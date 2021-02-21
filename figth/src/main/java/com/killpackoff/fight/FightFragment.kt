package com.killpackoff.fight

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.killpackoff.fight.databinding.ActivityFightBinding
import javax.inject.Inject

class FightFragment @Inject constructor(private val viewModel: FightViewModel) : Fragment() {

    private lateinit var binding: ActivityFightBinding
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityFightBinding.inflate(inflater).apply {
            viewmodel = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
        Toast.makeText(context, arguments?.getString("String"), Toast.LENGTH_SHORT).show()
        return binding.root
    }

}