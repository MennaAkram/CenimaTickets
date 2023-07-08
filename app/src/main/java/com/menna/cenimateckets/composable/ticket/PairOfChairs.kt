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
import com.menna.cenimateckets.composable.SpacerHorizontal8
import com.menna.cenimateckets.screens.ChairStates

@Composable
fun PairOfChairs(modifier: Modifier = Modifier) {
    Box() {
        Row() {
            ChairItem(state = ChairStates.Taken)
            SpacerHorizontal8()
            ChairItem()
        }
        Icon(
            modifier = modifier.padding( end =2.dp, bottom = 1.dp, top = 2.dp),
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