package com.bignerdranch.android.rabota1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import com.bignerdranch.android.rabota1.ui.theme.Red
import com.bignerdranch.android.rabota1.ui.theme.White

class EditAlarm : ComponentActivity() {
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
                        GeneralActivity().TextView("Добавить будильник")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Row() {
                        Timeline()
                    }
                    Row() {
                        Text(text = "Повторять каждый", color = White, modifier = Modifier.offset(x =25.dp, y = 175.dp))
                    }
                    Row() {
                        CheckView()
                    }
                    Row(modifier = Modifier.offset(y = 590.dp)) {
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                        ) {
                            Button(onClick = {},
                                colors = ButtonDefaults.buttonColors(backgroundColor = Red),
                                modifier = Modifier
                                    .size(340.dp, 50.dp)
                                    .clip(RoundedCornerShape(20))
                            ) {
                                Text(
                                    text = "Удалить будильник",
                                    color = MaterialTheme.colors.background,
                                    fontSize = 18.sp
                                )
                            }
                        }

                    }
                    Row(modifier = Modifier.offset(y=660.dp)) {
                        GeneralActivity().ButtonAdd("Создать будильник")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting8(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview8() {
    Rabota1Theme {
        Greeting8("Android")
    }
}