package com.bignerdranch.android.rabota1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import com.bignerdranch.android.rabota1.ui.theme.White

class ProfileActivity : ComponentActivity() {
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
                        GeneralActivity().TextView("Профиль пользователя")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Row (horizontalArrangement = Arrangement.Center, modifier = Modifier.offset(y=200.dp)){
                    Avatar()
                    }
                    Row(modifier = Modifier.offset(x = 130.dp, y = 475.dp)) {
                        Text(text = "Вход не выполнен", color = White)
                    }
                    Row (modifier = Modifier.offset(x = 0.dp, y = 585.dp)){
                        GeneralActivity().ButtonAdd("Войти")
                    }
                    Row (modifier = Modifier.offset(x = 0.dp, y = 650.dp)){
                        GeneralActivity().ButtonAdd("Регистрация")
                    }
                }
            }
        }
    }
}

@Composable
fun Avatar(){
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(250.dp)
    )
}

@Composable
fun Greeting9(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview9() {
    Rabota1Theme {
        Greeting9("Android")
    }
}