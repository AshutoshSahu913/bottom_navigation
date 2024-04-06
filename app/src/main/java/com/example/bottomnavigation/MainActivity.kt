@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.bottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.NotificationImportant
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.SlowMotionVideo
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme
import com.example.bottomnavigation.ui.theme.appColor
import com.example.bottomnavigation.ui.theme.color2
import com.example.bottomnavigation.ui.theme.color3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationTheme {
                MyBottomAppBar()
            }
        }
    }
}


@Composable
fun MyBottomAppBar() {
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Filled.Home)
    }

    //for set sheet is open or close
    val sheetState = rememberModalBottomSheetState()

    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    Scaffold(Modifier.background(Color.Transparent),bottomBar = {
        Card(
            modifier = Modifier.padding(10.dp).background(Color.Transparent), elevation = CardDefaults.cardElevation(5.dp)
        ) {

            BottomAppBar(containerColor = Color(0xFF40C4FF), modifier = Modifier.background(Color.Transparent)) {
                IconButton(onClick = {
                    selected.value = Icons.Filled.Home
                    navigationController.navigate(Screens.Home.route)
                    {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Filled.Home) Color.White else Color.DarkGray
                    )
                }

                IconButton(onClick = {
                    selected.value = Icons.Filled.Search
                    navigationController.navigate(Screens.Search.route)
                    {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Filled.Search) Color.White else Color.DarkGray
                    )
                }


                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp), contentAlignment = Alignment.Center
                ) {
                    FloatingActionButton(onClick = {
                        showBottomSheet = true
                    }

                    ) {

                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = null,
                            tint = Color.Green
                        )

                    }
                }
//                IconButton(onClick = {
//                    selected.value = Icons.Filled.FavoriteBorder
//                    navigationController.navigate(Screens.Like.route)
//                    {
//                        popUpTo(0)
//                    }
//                }, modifier = Modifier.weight(1f)) {
//                    Icon(
//                        imageVector = Icons.Filled.Favorite,
//                        contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Filled.FavoriteBorder) Color.White else Color.DarkGray
//                    )
//                }
                IconButton(onClick = {
                    selected.value = Icons.Filled.Settings
                    navigationController.navigate(Screens.Setting.route)
                    {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Filled.Settings) Color.White else Color.DarkGray
                    )
                }

                IconButton(onClick = {
                    selected.value = Icons.Filled.Person
                    navigationController.navigate(Screens.Profile.route)
                    {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Filled.Person) Color.White else Color.DarkGray
                    )
                }

            }
        }
    }
    ) {
        NavHost(
            navController = navigationController, startDestination = Screens.Home.route,
            modifier = Modifier.padding(paddingValues = it)
        ) {

            composable(Screens.Home.route) { HomeScreen() }
            composable(Screens.Search.route) { SearchScreen() }
            composable(Screens.Like.route) { LikeScreen() }
            composable(Screens.Setting.route) { SettingScreen() }
            composable(Screens.Profile.route) { ProfileScreen() }
            composable(Screens.Reels.route) { ReelsScreen() }
            composable(Screens.Comments.route) { CommentsScreen() }
            composable(Screens.Notifications.route) { NotificationScreen() }
        }
    }

    if (showBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = { showBottomSheet = false },
            sheetState = sheetState
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                BottomSheetItem(icon = Icons.Filled.SlowMotionVideo, title = "Create Reels") {
                    showBottomSheet = false
                    navigationController.navigate(Screens.Reels.route) {
                        popUpTo(0)
                    }
                }

                BottomSheetItem(icon = Icons.Filled.Message, title = "Comments") {
                    showBottomSheet = false
                    navigationController.navigate(Screens.Comments.route) {
                        popUpTo(0)
                    }
                }
                BottomSheetItem(icon = Icons.Filled.NotificationImportant, title = "Notification") {
                    showBottomSheet = false
                    navigationController.navigate(Screens.Notifications.route) {
                        popUpTo(0)
                    }
                }
            }
        }
    }


}


@Composable
fun NotificationScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(appColor)
    ) {

        Text(
            text = "Notification Screen",
            color = color2,
            fontSize = 25.sp,
            modifier = Modifier.align(Alignment.Center),
            fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold
        )
    }

}


@Composable
fun CommentsScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(appColor)
    ) {

        Text(
            text = "Comments Screen",
            color = color2,
            fontSize = 25.sp,
            modifier = Modifier.align(Alignment.Center),
            fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold
        )
    }

}

@Composable
fun ReelsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(appColor)
    ) {

        Text(
            text = "Reels Screen",
            color = color2,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun BottomSheetItem(icon: ImageVector, title: String, onClick: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onClick() }
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = color2)
        Text(text = title, color = color2, fontSize = 22.sp, fontWeight = FontWeight.Medium
        )
    }
}