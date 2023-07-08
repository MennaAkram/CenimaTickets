package com.menna.cenimateckets.composable.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.menna.cenimateckets.R
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pager(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState()

    HorizontalPager(
        modifier = modifier,
        state = pagerState,
        pageCount = 3,
        contentPadding = PaddingValues(horizontal = 64.dp),
        pageSpacing = (-12).dp,
    ) { page ->
        Card(
            modifier = Modifier.aspectRatio(0.66f).graphicsLayer {
                val pageOffset = (
                        (pagerState.currentPage - page) + pagerState
                            .currentPageOffsetFraction
                        ).absoluteValue

                scaleY = lerp(
                    start = 0.8f,
                    stop = 1f,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                )

                scaleX = lerp(
                    start = 0.8f,
                    stop = 1f,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                )

            },
            elevation = CardDefaults.cardElevation(0.dp),
            shape = RoundedCornerShape(32.dp)
        )
        {
            Image(
                painter = painterResource(R.drawable.slider2),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview
@Composable
fun PagerPreview() {
    Pager()
}