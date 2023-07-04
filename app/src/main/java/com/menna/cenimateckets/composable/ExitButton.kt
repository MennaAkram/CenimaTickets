package com.menna.cenimateckets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.menna.cenimateckets.R
import com.menna.cenimateckets.ui.theme.LightGrayTransparent

@Preview
@Composable
fun exitButton(){
    IconButton(
        onClick = {  },
    modifier = Modifier
    ) {
        Icon(
            painter = painterResource(R.drawable.close_circle),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape).background(color = LightGrayTransparent),
            tint = Color.White
        )
    }
}

//Column(modifier = Modifier.fillMaxSize(),
//horizontalAlignment = Alignment.CenterHorizontally,
//verticalArrangement = Arrangement.Center) {
//    IconButton(
//        onClick = { /* ... */ },
//        modifier = Modifier.size(50.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Add,
//            contentDescription = null,
//            modifier = Modifier.size(50.dp),
//            tint = Color.Red)
//    }
//}