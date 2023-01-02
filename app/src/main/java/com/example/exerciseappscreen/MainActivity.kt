package com.example.exerciseappscreen

import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.RED
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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

@Composable
fun ArtScreen() {

    Column(
        modifier = Modifier.padding(0.dp)

        ) {
        Image(
            painter = painterResource(id = R.drawable.yellow_tire2),
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

        Texting(text = "Gddd")

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