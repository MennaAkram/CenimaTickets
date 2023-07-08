package com.menna.cenimateckets.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.ui.theme.Border
import com.menna.cenimateckets.ui.theme.KumbhSans
import com.menna.cenimateckets.ui.theme.OnBackground_87

@Composable
fun Genre(text: String) {
    Text(
        text = text,
        fontFamily = KumbhSans,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = OnBackground_87,
        modifier = Modifier.border(
            width = 1.dp,
            color = Border,
            shape = RoundedCornerShape(16.dp)
        )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    )
}

@Preview
@Composable
fun GenrePreview() {
    Genre(text = "Fantasy")
}