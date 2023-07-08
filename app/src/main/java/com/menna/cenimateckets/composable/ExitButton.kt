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
import com.menna.cenimateckets.R
import com.menna.cenimateckets.ui.theme.LightGrayTransparent

@Composable
fun ExitButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(
        onClick = onClick,
    ) {
        Icon(
            painter = painterResource(R.drawable.close_circle),
            contentDescription = "",
            modifier = modifier.clip(CircleShape).background(color = LightGrayTransparent),
            tint = Color.White
        )
    }
}