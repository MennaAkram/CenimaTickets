package com.menna.cenimateckets.screens.ticket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.ui.theme.Border
import com.menna.cenimateckets.ui.theme.Gray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateChip(
    title:String ,
    subTitle: String,
    selectedColor: Color,
    unSelectedTitleColor: Color,
    unSlecectedSubTitleColor: Color,
    selectedSubTitleColor: Color
) {
    var selectedChip by remember { mutableStateOf(false) }

    SuggestionChip(
        onClick = { selectedChip = !selectedChip },
        modifier = Modifier
            .width(50.dp)
            .height(60.dp)
            .padding(0.dp),
        label = {
            Column(){
                Text(
                    text = title,
                    color = if (selectedChip) Color.White else unSelectedTitleColor)
//                Spacer(modifier = Modifier.height(4.dp))
                Text(
                        text = subTitle,
                        color = if (selectedChip) selectedSubTitleColor else unSlecectedSubTitleColor)
                }
             },
        colors = SuggestionChipDefaults.suggestionChipColors(
            if (selectedChip) selectedColor else Color.Transparent
        ),
        border = SuggestionChipDefaults.suggestionChipBorder(
            if(selectedChip) Color.Transparent else Border
        ),
        shape = RoundedCornerShape(16.dp),
        elevation = SuggestionChipDefaults.suggestionChipElevation(0.dp)
    )
}

@Composable
fun DateChips() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(6) {
            DateChip(
                title = "14", subTitle = "Thu", selectedColor = Gray,
                unSelectedTitleColor = Color.Black,
                unSlecectedSubTitleColor = Color.DarkGray,
                selectedSubTitleColor = Color.LightGray
            )
        }

    }
}