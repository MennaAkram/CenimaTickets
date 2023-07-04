package com.menna.cenimateckets.composable

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.ui.theme.Primary

@Composable
fun CircleIconButton(painter: Painter, modifier: Modifier = Modifier) {
    IconButton(
        onClick = {  },
        colors = IconButtonDefaults.iconButtonColors(containerColor = Primary),
        modifier = modifier.size(50.dp).clip(CircleShape)
    ) {
        Icon(
            painter = painter,
            contentDescription = "",
            tint = Color.White
        )
    }
}

@Preview
@Composable
fun CircleIconButtonPreview() {
    CircleIconButton(painter = painterResource(id = R.drawable.play_button))
}