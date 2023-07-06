package com.menna.cenimateckets.composable

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.ui.theme.Border
import com.menna.cenimateckets.ui.theme.Gray
import com.menna.cenimateckets.ui.theme.Primary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrimaryChip(
    text:String ,
    selectedColor: Color,
    unSelectedTextColor: Color,
) {
    var selectedChip by remember { mutableStateOf(false) }

    SuggestionChip(
        onClick = { selectedChip = !selectedChip },
        label = { Text(
            text = text,
            color = if (selectedChip) Color.White else unSelectedTextColor) },
        colors = SuggestionChipDefaults.suggestionChipColors(
            if (selectedChip) selectedColor else Color.Transparent
        ),
        border = SuggestionChipDefaults.suggestionChipBorder(
            if(selectedChip) Color.Transparent else Border
        ),
        shape = RoundedCornerShape(24.dp),
        elevation = SuggestionChipDefaults.suggestionChipElevation(0.dp)
    )
}

@Preview
@Composable
fun PrimaryChipPreview() {
    PrimaryChip(text = "10:00" , selectedColor = Gray, unSelectedTextColor = Color.Black)
}