package com.menna.cenimateckets.screens.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.menna.cenimateckets.composable.Genre
import com.menna.cenimateckets.composable.GenresUiState
import com.menna.cenimateckets.composable.Time
import com.menna.cenimateckets.screens.home.composable.BottomNavigation
import com.menna.cenimateckets.screens.home.composable.CategoryChips
import com.menna.cenimateckets.screens.home.composable.HomeBackground
import com.menna.cenimateckets.screens.home.composable.Pager
import com.menna.cenimateckets.screens.util.Screens
import com.menna.cenimateckets.ui.theme.OnBackground_87

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState()
    val genresUiState by remember { mutableStateOf(GenresUiState()) }
    var homeUiState by remember { mutableStateOf(HomeUiState()) }
    HomeScreenContent(
        state = homeUiState,
        genres = genresUiState,
        pagerState = pagerState,
        listener = object : HomeUiEvent{
            override fun onClickNowShowing() {
                homeUiState = homeUiState.copy(
                    homeUiState.nowShowingChip.copy(isSelected = true),
                    homeUiState.comingSoonChip.copy(isSelected = false)
                )
            }

            override fun onClickComingSoon() {
                homeUiState = homeUiState.copy(
                    homeUiState.comingSoonChip.copy(isSelected = true),
                    homeUiState.nowShowingChip.copy(isSelected = false)
                )
            }

            override fun onClickPager() {
                navController.navigate(Screens.Booking.route)
            }

            override fun onClickTicket() {
                navController.navigate(Screens.Ticket.route)
            }

        },
        )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreenContent(
    state: HomeUiState,
    genres: GenresUiState,
    listener: HomeUiEvent,
    pagerState: PagerState,
    modifier: Modifier = Modifier) {

   HomeBackground(state, pagerState)
Column (
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceBetween,
    modifier = modifier
        .fillMaxWidth()
){
        CategoryChips(
            modifier = modifier.padding(top = 24.dp),
            state = state
        )
        Pager(
            modifier = modifier.padding(top = 16.dp),
            state = state,
            onClick = listener::onClickPager
        )
        Time(
            modifier = modifier.padding(top = 24.dp),
            backgroundColor = Color.Transparent ,
            textColor = OnBackground_87)
        Text(
            text = state.title,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = modifier.padding(top = 16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier.padding(top = 16.dp)) {
            Genre(text = genres.genres[0])
            Genre(text = genres.genres[1])
        }
        BottomNavigation(isSelected = true)
    }
}
