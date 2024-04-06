package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val route: String) {
    data object Home : Screens("home")
    data object Search : Screens("search")
    data object Like : Screens("like")
    data object Setting : Screens("setting")
    data object Profile : Screens("profile")
    data object Reels : Screens("reels")
    data object Comments : Screens("comments")
    data object Notifications : Screens("notifications")
}