package com.menna.cenimateckets.screens.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.composable.ExitButton
import com.menna.cenimateckets.composable.Time
import com.menna.cenimateckets.ui.theme.LightGrayTransparent

@Composable
fun Header(onClick: () -> Unit,
           modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ExitButton(onClick)
        Time(backgroundColor = LightGrayTransparent, textColor = Color.White)
    }
}