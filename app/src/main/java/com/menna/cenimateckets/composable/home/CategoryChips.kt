package com.menna.cenimateckets.composable.home

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.menna.cenimateckets.composable.PrimaryChip
import com.menna.cenimateckets.composable.SpacerHorizontal8
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun CategoryChips() {
    Row {
        PrimaryChip(text = "Now Showing", selectedColor = Primary, unSelectedTextColor = Color.White)
        SpacerHorizontal8()
        PrimaryChip(text = "Coming soon", selectedColor = Primary, unSelectedTextColor = Color.White)
    }
}

@Preview
@Composable
fun Chipssprev() {
    CategoryChips()
}