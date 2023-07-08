package com.menna.cenimateckets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.ui.theme.KumbhSans
import com.menna.cenimateckets.ui.theme.LightGrayTransparent
import com.menna.cenimateckets.ui.theme.OnBackground_38

@Composable
fun Time(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    textColor: Color) {
    Row (modifier = modifier.clip(RoundedCornerShape(32.dp)).background(backgroundColor)
        .padding(4.dp)
        ){
        Icon(
            painter = painterResource(R.drawable.clock_circle),
            contentDescription = "" ,
            tint = OnBackground_38,
            modifier = Modifier.align(alignment = CenterVertically))
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "2h 23m",
            fontFamily = KumbhSans,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            color = textColor
        )
    }
}

@Preview
@Composable
fun TimePreview() {
    Time( backgroundColor = LightGrayTransparent, textColor = Color.White)
}