package com.menna.cenimateckets.composable.ticket

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Chairs(modifier: Modifier = Modifier) {
    LazyColumn(
    ){
        items(5){
            Row (
                modifier = modifier.fillMaxWidth().padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                PairOfChairs(modifier = Modifier.rotate(11.5f))
                PairOfChairs(modifier = Modifier.padding(top = 8.dp))
                PairOfChairs(modifier = Modifier.rotate(-11.5f))
            }
        }
    }
}

@Preview
@Composable
fun ChairsPreview() {
    Chairs()
}