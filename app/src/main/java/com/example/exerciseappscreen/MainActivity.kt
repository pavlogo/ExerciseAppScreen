package com.example.exerciseappscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciseappscreen.ui.theme.ExerciseAppScreenTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExerciseAppScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Magenta
                ) {
                    ArtScreen()
                }
            }
        }
    }
}

var bigText = "big text"

//var smallText = "small text"
var picture = R.drawable.yellow_tire2


@Composable
fun ArtScreen() {

    Column(
        modifier = Modifier.padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Image(
            painter = painterResource(id = picture),
            contentDescription = null,
            modifier = Modifier
                .rotate(0.0f)
                .padding(20.dp)
                .fillMaxWidth()
//                .fillMaxHeight()
            ,
            contentScale = ContentScale.Fit
        )

        Spacer(
            Modifier.height(0.dp)
        )

        Texting(text = bigText)

        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Gray)) {
                    append("small text bold ")
                }
                withStyle(style = SpanStyle(color = Color.LightGray)) {
                    append("(and normal)")
                }
            },
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(bottom = 40.dp)
        )

        Row() {
            Button(
                colors = buttonColors(Color.Red),
                onClick = { bigText = "1st button clicked" },
                enabled = true,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(110.dp)
            ) {
                Text(
                    text = "Previous",
                    color = Color.Yellow
                )
            }

            Button(
                colors = buttonColors(Color.Green),
                onClick = { bigText = "2nd button pressed" },
                enabled = true,
                modifier = Modifier
                    .padding(10.dp)
                    .width(110.dp)
            ) {
                Text(
                    text = "Next",
                    color = Color.Yellow
                )
            }
        }
    }
}

@Composable
fun Texting(text: String) {
    Column() {
        Text(
            text = text,
            color = Color.Red,
            fontSize = 44.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(10.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExerciseAppScreenTheme {
        ArtScreen()
    }
}