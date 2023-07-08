package com.menna.cenimateckets.screens.ticket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.ui.theme.Gray
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun TicketState(
    text: String,
    color: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(8.dp)
    ) {
        Box( modifier = Modifier
            .size(12.dp)
            .clip(CircleShape)
            .background(color))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, color = Gray)
    }
}

@Preview
@Composable
fun StatePrev() {
    TicketState(text = "Available", color = Primary)
}