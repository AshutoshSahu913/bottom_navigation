package com.example.bottomnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.SlowMotionVideo
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottomnavigation.ui.theme.appColor
import com.example.bottomnavigation.ui.theme.color1
import com.example.bottomnavigation.ui.theme.color2
import com.example.bottomnavigation.ui.theme.color3

@Preview
@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {


        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp))
                .height(250.dp)
                .background(
                    color2
                )
                .fillMaxWidth()
        )

        Column {

            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .padding(top = 100.dp, start = 10.dp, end = 10.dp)
                    .height(200.dp)
                , elevation = CardDefaults.cardElevation(5.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Box(
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .clip(RoundedCornerShape(100.dp))
                    ) {
                        Image(
                            painterResource(id = R.drawable.shocked1),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                        )
                    }
                    Text(
                        text = "Username",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = color2
                    )
                    Text(
                        text = "Email Address",
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                        color = color1
                    )
                }

            }
            Box(
                modifier = Modifier
                    .padding(20.dp),
                contentAlignment = Alignment.Center

            ) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Column(
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .background(color3),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Icon(
                            imageVector = Icons.Filled.Image,
                            tint = color2,
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Text(
                            text = "Photo",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = color1
                        )
                    }

                    Column(
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .background(color3),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Icon(
                            imageVector = Icons.Filled.SlowMotionVideo,
                            tint = color2,
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Text(
                            text = "Videos",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = color1
                        )
                    }

                }

            }
        }


    }
}