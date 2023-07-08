package com.menna.cenimateckets.screens.ticket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.composable.PrimaryChip
import com.menna.cenimateckets.ui.theme.Gray

@Composable
fun TimeChips() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(6){
           PrimaryChip(
              text = "10:00" ,
              selectedColor = Gray,
              unSelectedTextColor = Color.Black
           )
        }
}
}