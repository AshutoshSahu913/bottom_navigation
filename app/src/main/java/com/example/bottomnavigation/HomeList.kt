package com.example.bottomnavigation

import android.icu.text.CaseMap.Title
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bluetooth
import androidx.compose.material.icons.filled.Brightness4
import androidx.compose.material.icons.filled.DataUsage
import androidx.compose.material.icons.filled.Flight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PhonelinkLock
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material.icons.filled.Wallpaper
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.ui.graphics.vector.ImageVector

data class HomeList(
    val id: Int,
    val name: String,
    val profile: Int,
    val image: Int,
    val likes: Int,
    val shares: Int,
    val comments: Int
)

val listsOfHomeItems = listOf(
    HomeList(1, "Happy", R.drawable.smile, R.drawable.smile1, 10, 5, 2),
    HomeList(2, "Confused", R.drawable.confused, R.drawable.confused1, 15, 8, 3),
    HomeList(3, "Angry", R.drawable.angry, R.drawable.angry1, 10, 5, 3),
    HomeList(4, "Cool", R.drawable.cool, R.drawable.sad1, 12, 6, 4),
    HomeList(5, "Like", R.drawable.emoji, R.drawable.like1, 25, 15, 8),
    HomeList(6, "Love", R.drawable.kiss, R.drawable.love1, 18, 9, 6),
    HomeList(7, "Shocked", R.drawable.shocked, R.drawable.shocked1, 30, 20, 12),
    HomeList(8, "Thinking", R.drawable.thinking, R.drawable.thinking1, 22, 12, 7)
)


data class SettingList(val image:ImageVector,val title: String)

val listsOfSettingItems= listOf(
    SettingList(Icons.Filled.Wifi,"Wi-Fi"),
    SettingList(Icons.Filled.Bluetooth,"Bluetooth"),
    SettingList(Icons.Filled.Flight,"Flight mode"),
    SettingList(Icons.Filled.DataUsage,"Data usage"),
    SettingList(Icons.Filled.VolumeUp,"Sound"),
    SettingList(Icons.Filled.Brightness4,"Brightness"),
    SettingList(Icons.Filled.Wallpaper,"Wallpaper"),
    SettingList(Icons.Filled.PhonelinkLock,"Lock Screen"),
    SettingList(Icons.Filled.Notifications,"Notification"),
)
