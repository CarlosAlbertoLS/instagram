package com.sonder.instagram.ui.reels

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.sonder.instagram.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReelFragment : Fragment() {
    private val viewModel by viewModels<ReelViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reel, container, false)
    }
}