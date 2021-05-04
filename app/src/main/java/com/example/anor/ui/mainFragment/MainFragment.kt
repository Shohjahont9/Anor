package com.example.anor.ui.mainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.anor.R
import com.example.anor.base.BaseFragment
import com.example.anor.databinding.FragmentMainBinding
import com.example.anor.model.ItemModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>() {

    private val viewModel: MainViewModel by viewModels()

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentMainBinding =
        FragmentMainBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.episodes(1)
        viewModel.getEpisode.observe(viewLifecycleOwner, {
            if (it.data != null){
                val episode = it
                println(episode.data!!.name)
                println(episode.data.episode)
                println(episode.data.characters!![0])
            }
        })


    }
}