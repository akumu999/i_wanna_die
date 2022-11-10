package com.bignerdranch.android.rabota1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import com.bignerdranch.android.rabota1.ui.theme.White

class UserLogin2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = GreenColor) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Войти")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Column() {
                        TextBoxes2()
                    }
                    Column(modifier = Modifier.offset(y=375.dp)) {
                        GeneralActivity().ButtonAdd("Войти")
                    }
                }
            }
        }
    }
}

@Composable
fun TextBoxes2()
{
    var text by rememberSaveable { mutableStateOf("Имя пользователя") }
    var text3 by rememberSaveable { mutableStateOf("Пароль") }
    Column() {
        TextField(
            value = text,
            onValueChange = {
                text = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 225.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
        TextField(
            value = text3,
            onValueChange = {
                text3 = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 255.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
    }


}

@Composable
fun Greeting10(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview10() {
    Rabota1Theme {
        Greeting10("Android")
    }
}