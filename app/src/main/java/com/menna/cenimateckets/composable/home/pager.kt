package com.menna.cenimateckets.composable.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.menna.cenimateckets.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pager() {
    val pagerState = rememberPagerState()

    HorizontalPager(
        pageCount = 3,
        state = pagerState,
        userScrollEnabled = true,
        reverseLayout = true,
    ) {
        Image(
            painter = painterResource(R.drawable.slider2),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .clip(RoundedCornerShape(32.dp))

        )
    }
}

@Preview
@Composable
fun PagerPreview() {
    Pager()
}