package com.menna.cenimateckets.composable.ticket

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.menna.cenimateckets.composable.PrimaryChip
import com.menna.cenimateckets.composable.SpacerHorizontal8
import com.menna.cenimateckets.ui.theme.Gray

@Composable
fun TimeChips() {
    Row {
        PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
        SpacerHorizontal8()
        PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
        SpacerHorizontal8()
        PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
        SpacerHorizontal8()
        PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
        SpacerHorizontal8()
        PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
        SpacerHorizontal8()
        PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
    }
}

@Preview
@Composable
fun TimeChipPreview() {
   TimeChips()
}