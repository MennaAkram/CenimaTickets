package com.menna.cenimateckets.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.ui.theme.KumbhSans

@Composable
fun Time(painter: Painter, text: String) {
    Row {
        Icon(
            painter = painter,
            contentDescription = "" ,
            modifier = Modifier.align(alignment = CenterVertically))
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = text,
            fontFamily = KumbhSans,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
        )
    }
}

@Preview
@Composable
fun TimePreview() {
    Time(painter = painterResource(R.drawable.clock_circle), text = "2h 23m")
}