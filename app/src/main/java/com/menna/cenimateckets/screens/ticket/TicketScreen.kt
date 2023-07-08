package com.menna.cenimateckets.screens.ticket

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.ExitButton
import com.menna.cenimateckets.screens.ticket.composable.BottomSheet
import com.menna.cenimateckets.screens.ticket.composable.Chairs
import com.menna.cenimateckets.screens.ticket.composable.TicketState
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun TicketScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Row(modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ExitButton(onClick = { navController.navigateUp() })
        }
        Image(modifier = modifier
            .fillMaxWidth()
            .aspectRatio(4.5f),
            painter = painterResource(R.drawable.subtract),
            contentDescription = "")
        Chairs()
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TicketState(text = "Available", color = Color.White)
            TicketState(text = "Taken", color = Color.Gray)
            TicketState(text = "Selected", color = Primary)
        }
        Spacer(modifier = modifier.height(8.dp))
        BottomSheet()
    }
}