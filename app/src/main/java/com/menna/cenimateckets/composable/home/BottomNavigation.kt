package com.menna.cenimateckets.composable.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.CircleIconButton
import com.menna.cenimateckets.ui.theme.OnBackground_87

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigation(
    isSelected: Boolean
) {
    Scaffold (
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Transparent,
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                NavigationBarItem(selected = false, onClick = {  },
                    colors = NavigationBarItemDefaults.colors(
                        if(isSelected) Color.White else OnBackground_87
                    ),
                    icon = {
                        CircleIconButton(painter = painterResource(R.drawable.movie))
                })
                NavigationBarItem(selected = false, onClick = {  }, icon = {
                    Icon(painter = painterResource(R.drawable.search), contentDescription = "")
                })
                NavigationBarItem(selected = false, onClick = {  }, icon = {
                    Icon(painter = painterResource(R.drawable.tickett), contentDescription = "")
                })
                NavigationBarItem(selected = false, onClick = {  }, icon = {
                    Icon(painter = painterResource(R.drawable.user), contentDescription = "")
                })
            }
        }
    ){  PaddingValues( 8.dp)
    }
}

@Preview
@Composable
fun BottomNavPreview() {
    BottomNavigation(isSelected = true)
}