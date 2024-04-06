package com.example.bottomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bottomnavigation.ui.theme.appColor
import com.example.bottomnavigation.ui.theme.color2

@Preview
@Composable
fun LikeScreen() {
    Box(modifier = Modifier.fillMaxSize().background(appColor)) {
        Text(
            text = "Like Screen",
            modifier = Modifier.align(Alignment.Center),
            color = color2,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold
        )
    }
}