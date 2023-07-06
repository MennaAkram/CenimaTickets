package com.menna.cenimateckets.composable.ticket

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R

@Composable
fun TicketState(
    text: String,
) {
    Row() {
        Image(painter = painterResource(R.drawable.circle),
            contentDescription = "")
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }

}

@Preview
@Composable
fun StatePrev() {
    TicketState(text = "Available")
}