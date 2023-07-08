package com.menna.cenimateckets.composable

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.composable.spacing.padding_horizontal.SpacerHorizontal8
import com.menna.cenimateckets.ui.theme.KumbhSans
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun PrimaryButton(
    text : String,
    painter: Painter,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Primary),
        modifier = modifier.height(48.dp)
    ){
        Icon(painter = painter, contentDescription = "")
        SpacerHorizontal8()
        Text(
            text = text,
            fontFamily = KumbhSans,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    }
}