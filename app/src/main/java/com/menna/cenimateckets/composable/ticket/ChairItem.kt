package com.menna.cenimateckets.composable.ticket

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.menna.cenimateckets.R
import com.menna.cenimateckets.screens.ChairStates
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun ChairItem(
    modifier: Modifier = Modifier,
    state: ChairStates = ChairStates.Available,
) {

    var isSelected by remember { mutableStateOf(false) }

    val chairColor = when (state){
        ChairStates.Available -> Color.White
        ChairStates.Taken -> Color.DarkGray
        ChairStates.Selected -> Primary
    }
    IconButton(onClick = { isSelected = !isSelected }) {
        Icon(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource( R.drawable.seat ),
            contentDescription = "",
            tint = if(isSelected) Primary  else Color.White
        )
    }
}

@Preview
@Composable
fun ChairPreview() {
    ChairItem()
}

