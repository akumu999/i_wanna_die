package com.bignerdranch.android.rabota1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import com.bignerdranch.android.rabota1.ui.theme.White

class CreateAlarmActivity : ComponentActivity() {
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
                    Row(modifier = Modifier.offset(y=660.dp)) {
                        GeneralActivity().ButtonAdd("Создать будильник")
                    }
                }
            }
        }
    }
}

@Composable
fun Timeline(){
    var text2 by rememberSaveable { mutableStateOf("16:30") }
    var text3 by rememberSaveable { mutableStateOf("14.01.2021") }
    Row() {
        TextField(
            value = text2,
            onValueChange = {
                text2 = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 100.dp)
                .clip((RoundedCornerShape(20)))
                .size(150.dp, 50.dp)
                .background(White)
        )
        TextField(
            value = text3,
            onValueChange = {
                text3 = it
            }, modifier = Modifier
                .offset(x = 70.dp, y = 100.dp)
                .clip((RoundedCornerShape(20)))
                .size(150.dp, 50.dp)
                .background(White)
        )
    }
}

@Composable
fun CheckView(){
    val isChecked = remember { mutableStateOf(false) }
Column(modifier = Modifier.offset(x = 10.dp, y = 200.dp)) {
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it },enabled = true)
        Text(text = "Понедельник", modifier = Modifier.offset(y = 13.dp), color = White)
    }
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, enabled = true)
        Text(text = "Вторник", modifier = Modifier.offset(y = 13.dp), color = White)
    }
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, enabled = true)
        Text(text = "Среда", modifier = Modifier.offset(y = 13.dp), color = White)
    }
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, enabled = true)
        Text(text = "Четверг", modifier = Modifier.offset(y = 13.dp), color = White)
    }
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, enabled = true)
        Text(text = "Пятница", modifier = Modifier.offset(y = 13.dp), color = White)
    }
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, enabled = true)
        Text(text = "Суббота", modifier = Modifier.offset(y = 13.dp), color = White)
    }
    Row {
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, enabled = true)
        Text(text = "Воскресенье", modifier = Modifier.offset(y = 13.dp), color = White)
    }
}

}

@Composable
fun Greeting7(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview7() {
    Rabota1Theme {
        Greeting7("Android")
    }
}