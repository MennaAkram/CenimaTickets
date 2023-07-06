package com.menna.cenimateckets.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.exitButton
import com.menna.cenimateckets.composable.ticket.BottomSheet

@Composable
fun TicketScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp).padding(top = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            exitButton()
        }
        Image(modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.subtract),
            contentDescription = "")
Spacer(modifier = Modifier.height(310.dp))
        Spacer(modifier = Modifier.height(8.dp))
        BottomSheet()
    }
}

@Preview
@Composable
fun TicketPrev() {
    TicketScreen()
}