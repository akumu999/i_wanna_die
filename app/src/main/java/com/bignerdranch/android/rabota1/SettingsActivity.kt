package com.bignerdranch.android.rabota1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import com.bignerdranch.android.rabota1.ui.theme.White

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = GreenColor) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Настройки")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Row {
                        GeneralActivity().BottomPanel("")
                    }
                    Row {
                        Texts()
                    }
                }
                }
            }
        }
    }


@Composable
fun Texts(){
    Column(modifier = Modifier.offset(x = 10.dp, y=100.dp)) {
        Text(text = "Профиль пользователя                    >", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp))
        Text(text = "Дата и время                                       >", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=20.dp))
        Text(text = "Настройки звука                                >", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=40.dp))
        Text(text = "Проверить обновления                    >", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=60.dp))
    }

}

@Composable
fun Greeting3(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Rabota1Theme {
        Greeting3("Android")
    }
}