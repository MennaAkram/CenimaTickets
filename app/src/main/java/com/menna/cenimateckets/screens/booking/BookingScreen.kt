package com.menna.cenimateckets.screens.booking

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.CircleIconButton
import com.menna.cenimateckets.screens.booking.composable.BottomSheet
import com.menna.cenimateckets.screens.booking.composable.Header

@Composable
fun BookingScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(R.drawable.background),
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.TopCenter
            )
    ) {
        Header(onClick = {navController.navigateUp()})
        CircleIconButton(painter = painterResource(id = R.drawable.play_button))
        BottomSheet(navController)
    }

}
