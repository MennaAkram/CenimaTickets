package com.menna.cenimateckets.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.composable.Genre
import com.menna.cenimateckets.composable.SpacerHorizontal8
import com.menna.cenimateckets.composable.Time
import com.menna.cenimateckets.composable.home.BottomNavigation
import com.menna.cenimateckets.composable.home.CategoryChips
import com.menna.cenimateckets.composable.home.HomeBackground
import com.menna.cenimateckets.composable.home.Pager
import com.menna.cenimateckets.ui.theme.OnBackground_87

@Composable
fun HomeScreen() {
   HomeBackground()
Column (
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
        .fillMaxWidth()
){
        CategoryChips(modifier = Modifier.padding(top = 24.dp))
        Pager(modifier = Modifier.padding(top = 16.dp))
        Time(
            modifier = Modifier.padding(top = 24.dp),
            backgroundColor = Color.Transparent ,
            textColor = OnBackground_87)
        Text(
            text = "Fantastic Beasts: The Secrets of Dumbledore",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        Row(modifier = Modifier.padding(top = 16.dp)) {
            Genre(text = "Fantasy")
            SpacerHorizontal8()
            Genre(text = "Adventure")
        }
        BottomNavigation(isSelected = true)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}