package com.menna.cenimateckets.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.booking.BottomSheet
import com.menna.cenimateckets.composable.CircleIconButton
import com.menna.cenimateckets.composable.Time
import com.menna.cenimateckets.composable.exitButton
import com.menna.cenimateckets.ui.theme.LightGrayTransparent

@Composable
fun BookingScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .paint(
                painter = painterResource(R.drawable.background),
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.TopCenter
            )
    ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    exitButton()
                    Time(backgroundColor = LightGrayTransparent, textColor = Color.White)
                }
        Spacer(modifier = Modifier.weight(1f))
                CircleIconButton(painter = painterResource(id = R.drawable.play_button))
        Spacer(modifier = Modifier.weight(1f))
        BottomSheet()
            }

}

@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen()
}