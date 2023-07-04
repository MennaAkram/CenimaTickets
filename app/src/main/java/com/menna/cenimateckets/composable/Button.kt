package com.menna.cenimateckets.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.ui.theme.KumbhSans
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun PrimaryButton(text : String, painter: Painter, modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = Primary),
        modifier = modifier.height(48.dp)
    ){
        Icon(painter = painter, contentDescription = "")
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            fontFamily = KumbhSans,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(text = "Booking", painter = painterResource(R.drawable.card))
}