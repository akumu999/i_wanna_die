package com.bignerdranch.android.rabota1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.*

class AlarmActivity : ComponentActivity() {
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
                        GeneralActivity().TextView("Будильник")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Row (modifier = Modifier.offset(x = 0.dp, y = 600.dp)){
                        GeneralActivity().ButtonAdd("Добавить будильник")
                    }
                    Row {
                        GeneralActivity().BottomPanel("")
                    }
                    Row {
                        SwitcherView()
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun SwitcherView() {
        var checkedState by remember {
            mutableStateOf(true)
        }
        Switch(
            checked = checkedState, onCheckedChange = { checkedState = it },
            modifier = Modifier
                .size(60.dp, 35.dp)
                .offset(x = 300.dp, y = 150.dp),
            colors = SwitchDefaults.colors(
                checkedThumbColor = White,
                checkedTrackColor = Color(0xFFAAF683),
                uncheckedThumbColor = White,
                uncheckedTrackColor = Color(0xFFFF0000)
            )
        )
        Text(text = "07:30", fontSize = 70.sp, modifier = Modifier.offset(y = 110.dp), color = White)
    }


    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Rabota1Theme {
            Greeting("Android")
        }
    }