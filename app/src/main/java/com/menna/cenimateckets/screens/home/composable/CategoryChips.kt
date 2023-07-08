package com.menna.cenimateckets.screens.home.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.menna.cenimateckets.composable.PrimaryChip
import com.menna.cenimateckets.composable.spacing.padding_horizontal.SpacerHorizontal8
import com.menna.cenimateckets.screens.home.HomeUiState
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun CategoryChips(
    modifier: Modifier = Modifier,
    state: HomeUiState
) {
    Row (modifier = modifier){
        PrimaryChip(
            text = state.nowShowingChip.title,
            selectedColor = Primary,
            unSelectedTextColor = Color.White,
            isSelected = state.nowShowingChip.isSelected
        )
        SpacerHorizontal8()
        PrimaryChip(
            text = state.comingSoonChip.title,
            selectedColor = Primary,
            unSelectedTextColor = Color.White,
            isSelected = state.comingSoonChip.isSelected
        )
    }
}

@Preview
@Composable
fun Chipssprev() {
    val state: HomeUiState = HomeUiState()
    CategoryChips(state = state)
}