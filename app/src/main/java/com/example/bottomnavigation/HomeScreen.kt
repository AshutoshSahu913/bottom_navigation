package com.example.bottomnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Message
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottomnavigation.ui.theme.color1
import com.example.bottomnavigation.ui.theme.color2
import com.example.bottomnavigation.ui.theme.color3

@Preview
@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.padding(5.dp)) {
            items(listsOfHomeItems) {

                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .align(Alignment.Center),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(Color.White)
                ) {

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(5.dp)
                                .size(26.dp)
                                .clip(RoundedCornerShape(100.dp))
                        ) {
                            Image(
                                painterResource(id = it.profile),
                                contentDescription = null,
                            )
                        }
                        Text(
                            text = it.name,
                            color = Color.Black,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                                .fillMaxWidth()
                        )
                    }


                    Box(modifier = Modifier.padding(5.dp, top = 10.dp, bottom = 10.dp)) {
                        Image(
                            painterResource(it.image),
                            "content description",
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .height(100.dp),
                            contentScale = ContentScale.FillHeight
                        )
                    }

                    Row(
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .fillMaxWidth()
                            .size(49.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .height(35.dp)
                                .background(color3),
                            contentAlignment = Alignment.Center,

                            ) {
                            Row(horizontalArrangement = Arrangement.Center) {
                                Icon(
                                    imageVector = Icons.Outlined.Message,
                                    contentDescription = "",
                                    tint = color2
                                )
                                Spacer(modifier = Modifier.padding(start = 5.dp))
                                Text(
                                    text = it.comments.toString(),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = color2
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .height(35.dp)
                                .background(color3),
                            contentAlignment = Alignment.Center,

                            ) {
                            Row(horizontalArrangement = Arrangement.Center) {
                                Icon(
                                    imageVector = Icons.Outlined.Favorite,
                                    contentDescription = "",
                                    tint = color2
                                )
                                Spacer(modifier = Modifier.padding(start = 5.dp))
                                Text(
                                    text = it.likes.toString(),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = color2
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .height(35.dp)
                                .background(color3),
                            contentAlignment = Alignment.Center,

                            ) {
                            Row(horizontalArrangement = Arrangement.Center) {
                                Icon(
                                    imageVector = Icons.Filled.Share,
                                    contentDescription = "",
                                    tint = color2
                                )
                                Spacer(modifier = Modifier.padding(start = 5.dp))
                                Text(
                                    text = it.shares.toString(),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = color2
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .height(35.dp)
                                .background(color3),
                            contentAlignment = Alignment.Center,

                            ) {
                            Row(horizontalArrangement = Arrangement.Center) {
                                Icon(
                                    imageVector = Icons.Outlined.MoreVert,
                                    contentDescription = "",
                                    tint = color2
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}