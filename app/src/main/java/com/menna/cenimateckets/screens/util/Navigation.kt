package com.menna.cenimateckets.screens.util

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.menna.cenimateckets.screens.booking.BookingScreen
import com.menna.cenimateckets.screens.home.HomeScreen
import com.menna.cenimateckets.screens.ticket.TicketScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(
    navController: NavHostController,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: Screens.Home.route

    Scaffold(
    ) { screenPadding ->
        NavHost(
            navController = navController,
            startDestination = Screens.Home.route,
            modifier = Modifier.padding(screenPadding)
        ) {
            composable(Screens.Home.route) {
                HomeScreen(navController = navController)
            }
            composable(Screens.Booking.route) {
                BookingScreen(navController = navController)
            }
            composable(Screens.Ticket.route) {
                TicketScreen(navController = navController)
            }
        }
    }

}

sealed class Screens(val route: String) {
    object Booking : Screens("booking")
    object Ticket : Screens("buy_tickets")
    object Home : Screens("home")
}