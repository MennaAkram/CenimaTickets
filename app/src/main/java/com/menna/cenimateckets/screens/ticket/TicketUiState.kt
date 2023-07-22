package com.menna.cenimateckets.screens.ticket

data class TicketUiState(
    val DaysNumber: List<String> = listOf(
        "14", "15", "16", "17", "18", "19", "20"),
    val Days: List<String> = listOf(
        "Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wen"
    ),
    val Time: List<String> = listOf(
        "10:00", "12:30", "15:30", "18:30", "21:30", "00:30"
    )
)
