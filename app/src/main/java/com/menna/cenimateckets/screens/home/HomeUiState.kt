package com.menna.cenimateckets.screens.home

import com.menna.cenimateckets.R
import com.menna.cenimateckets.screens.home.composable.CategoryChipsUiState

data class HomeUiState(
    val nowShowingChip: CategoryChipsUiState = CategoryChipsUiState("Now Showing", true),
    val comingSoonChip: CategoryChipsUiState = CategoryChipsUiState("Coming Soon", false),
    val images: List<Int> = listOf(
        R.drawable.slider1,
        R.drawable.slider2,
        R.drawable.slider3
    ),
    val time: String = "2h 23m",
    val title: String = "Fantastic Beasts: The Secrets of Dumbledore",
)
