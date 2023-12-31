package com.menna.cenimateckets.screens.ticket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.PrimaryButton
import com.menna.cenimateckets.composable.spacing.padding_vertical.SpacerVertical12
import com.menna.cenimateckets.ui.theme.Gray
import com.menna.cenimateckets.ui.theme.OnBackground_87

@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.clip(
            RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
        )
    ) {
        Column(
            modifier = Modifier.padding(vertical = 24.dp, horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            DateChips()
            TimeChips()
            SpacerVertical12()
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
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
                PrimaryButton(text = "Buy tickets", painter = painterResource(id = R.drawable.card),
                    onClick = {}
                )
            }

        }
    }
}

@Preview
@Composable
fun Prevthis() {
    BottomSheet()
}