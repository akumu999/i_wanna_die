package com.bignerdranch.android.rabota1

import android.os.Bundle
import android.widget.CalendarView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme

class CalendarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenColor
                ) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Календарь")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Row {
                        GeneralActivity().BottomPanel("")
                    }
                    Row {
                        Calendarix()
                    }
                }
                }
            }
        }
    }


@Composable
fun Calendarix(){
    AndroidView({ CalendarView(it)},
    modifier = Modifier
        .wrapContentWidth()
        .offset(x = 25.dp, y = 150.dp),
    update = {
        views ->
        views.setOnDateChangeListener{calendarView, i, i2, i3 ->

        }
    })
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Rabota1Theme {
        Greeting2("Android")
    }
}