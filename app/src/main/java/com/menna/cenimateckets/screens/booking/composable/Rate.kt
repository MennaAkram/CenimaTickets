package com.menna.cenimateckets.screens.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.ui.theme.Gray

@Composable
fun Rate(
    rate: String,
    totalRate: String,
    title: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row() {
            Text(text = rate)
            Text(text = totalRate,
                color = Gray)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = title, color = Gray)
    }
}

@Preview
@Composable
fun RatePrev() {
    Rate(rate = "6.8", totalRate = "/10", title = "IMDb")
}