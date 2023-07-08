package com.menna.cenimateckets.screens.home.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.screens.home.HomeUiState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeBackground(
    state: HomeUiState,
    pagerState: PagerState
) {
    Box() {
        Image(
            painter = painterResource(R.drawable.slider2),
//            painter = painterResource(rememberAsyncImagePainter(model = state.images[pagerState.currentPage])),
            modifier = Modifier
                .fillMaxHeight(fraction = 0.5f)
                .blur(32.dp,)
                .offset(y = (-32).dp),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
    }

}