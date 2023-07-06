package com.menna.cenimateckets.composable.ticket

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.Genre
import com.menna.cenimateckets.composable.PrimaryButton
import com.menna.cenimateckets.composable.SpacerHorizontal8
import com.menna.cenimateckets.composable.booking.ImageCard
import com.menna.cenimateckets.composable.booking.Rate
import com.menna.cenimateckets.ui.theme.Gray
import com.menna.cenimateckets.ui.theme.LightGrayTransparent
import com.menna.cenimateckets.ui.theme.OnBackground_87

@Composable
fun BottomSheet(
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier
        .clip(
            RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
        )
    ) {
        Column(
            modifier = Modifier.padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
                DateChips()
            Spacer(modifier = Modifier.height(16.dp))
            TimeChips()
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Column(){
                    Text(
                        text = "$100.00",
                        color = OnBackground_87,
                        fontSize = 24.sp)
                Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "4 tickets",
                        color = Gray,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.width(80.dp))
                PrimaryButton(text = "Buy tickets", painter = painterResource(id = R.drawable.card))
            }

        }
    }
}

@Preview
@Composable
fun Prevthis() {
    BottomSheet()
}