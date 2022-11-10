package com.bignerdranch.android.rabota1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.*

class EditTaskActivity : ComponentActivity() {
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
                        GeneralActivity().TextView("Изменить задачу")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Row {
                        Tasks()
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
                                    text = "Удалить задачу",
                                    color = MaterialTheme.colors.background,
                                    fontSize = 18.sp
                                )
                            }
                        }

                    }
                    Row(modifier = Modifier.offset(y=660.dp)) {
                        GeneralActivity().ButtonAdd("Записать задачу")
                    }

                }
            }
        }
    }
}

@Composable
fun Tasks()
{
    var text by rememberSaveable { mutableStateOf("Заголовок задачи") }
    var text2 by rememberSaveable { mutableStateOf("16:30")}
    var text3 by rememberSaveable { mutableStateOf("14.01.2021") }
    var text4 by rememberSaveable { mutableStateOf("Описание задачи") }
    Column() {
        TextField(
            value = text,
            onValueChange = {
                text = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 125.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
        Row() {
            TextField(
                value = text2,
                onValueChange = {
                    text2 = it
                }, modifier = Modifier
                    .offset(x = 30.dp, y = 150.dp)
                    .clip((RoundedCornerShape(20)))
                    .size(150.dp, 50.dp)
                    .background(White)
            )
            TextField(
                value = text3,
                onValueChange = {
                    text3 = it
                }, modifier = Modifier
                    .offset(x = 70.dp, y = 150.dp)
                    .clip((RoundedCornerShape(20)))
                    .size(150.dp, 50.dp)
                    .background(White)
            )
        }
        Column() {
            TextField(
                value = text4,
                onValueChange = {
                    text4 = it
                }, modifier = Modifier
                    .offset(x = 30.dp, y = 170.dp)
                    .clip((RoundedCornerShape(10)))
                    .size(340.dp, 150.dp)
                    .background(White)
            )
        }


    }


}

@Composable
fun Greeting5(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    Rabota1Theme {
        Greeting5("Android")
    }
}