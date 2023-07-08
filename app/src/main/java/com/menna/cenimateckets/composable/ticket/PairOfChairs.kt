package com.menna.cenimateckets.composable.ticket

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R

@Composable
fun PairOfChairs(modifier: Modifier = Modifier) {
    Box(modifier = modifier.padding(1.dp)) {
        Row(modifier = Modifier.padding(start = 3.dp)) {
            ChairItem()
            ChairItem()
        }
        Icon(
            modifier = Modifier.padding(top = 10.dp),
            painter = painterResource( R.drawable.arch ),
            contentDescription = "",
            tint = Color.DarkGray
        )
    }
}

@Preview
@Composable
fun PairOfChairsPreview() {
    PairOfChairs()
}