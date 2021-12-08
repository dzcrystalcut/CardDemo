package com.lessons.carddemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lessons.carddemo.ui.theme.CardDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            MoreCards()

        }
    }
}



@Composable
fun MoreCards(){
    Column {
        Spacer(modifier = Modifier.height(10.dp))
        CardDemo()
        Spacer(modifier = Modifier.height(10.dp))
        CardDemo()
        Spacer(modifier = Modifier.height(10.dp))
        CardDemo()
    }
}








@Composable
fun CardDemo() {



    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
            .clickable { },

        )

    {

    Column {


            Row(modifier = Modifier.height(200.dp)) {


                Image(
                    painterResource(R.drawable.mykonos),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(5.dp).clip(
                            RoundedCornerShape(10.dp))
                )


                Column(modifier = Modifier.weight(1f))
                {
                    Box(modifier = Modifier.height(170.dp)) {
                        Text(
                            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum " +
                                    "has been the industry's standard dummy text ever since the 1500s, when an unknown printer ",
                                    //"took a galley of type and scrambled it to make a type specimen book. It has survived not only",
                            modifier = Modifier.padding(10.dp),
                            fontSize = 14.sp,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(text = "A. Lorem Ipsum is simply dummy ",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(), fontSize = 10.sp)
                    Text(text = "B. Lorem Ipsum is simply dummy ",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(), fontSize = 10.sp)
                }


            }

            Row(modifier = Modifier
                .height(30.dp)
                .fillMaxWidth()
                .padding(5.dp),
                Arrangement.SpaceAround) {
                Text(text = "Trips", fontSize = 10.sp)
                    //modifier = Modifier.weight(1f))
                Icon(Icons.Rounded.PlayArrow, contentDescription = "Localized description")
                    //modifier = Modifier.weight(1f))
                Icon(Icons.Rounded.Place, contentDescription = "Localized description")
                    //modifier = Modifier.weight(1f))
                Icon(Icons.Rounded.Share, contentDescription = "Localized description")
                    //modifier = Modifier.weight(1f))
                Icon(Icons.Rounded.MoreVert, contentDescription = "Localized description")
                    //modifier = Modifier.weight(1f))
            }
        }
    }
}







