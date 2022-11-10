package com.bignerdranch.android.rabota1

import android.os.Bundle
import android.widget.EditText
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.White

class UserLogin : ComponentActivity() {
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
                        GeneralActivity().TextView("Регистрация")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Column() {
                        TextBoxes()
                    }
                    Column(modifier = Modifier.offset(y=450.dp)) {
                        GeneralActivity().ButtonAdd("Регистрация")
                    }
                }
            }
        }
    }
}

@Composable
fun TextBoxes()
{
    var text by rememberSaveable { mutableStateOf("Имя пользователя") }
    var text2 by rememberSaveable { mutableStateOf("Адрес электронной почты")}
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
                value = text2,
        onValueChange = {
            text2 = it
        }, modifier = Modifier
                .offset(x = 30.dp, y = 250.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
        TextField(
            value = text3,
            onValueChange = {
                text3 = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 275.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
    }


}

@Composable
fun Greeting4(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    Rabota1Theme {
        Greeting4("Android")
    }
}