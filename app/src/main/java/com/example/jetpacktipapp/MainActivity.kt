@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpacktipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktipapp.components.InputField
import com.example.jetpacktipapp.ui.theme.JetpackTipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyApp {
                TopHeader()
            }
        }
    }
}

/*
    We want to decouple the app by using a container function.
    The JetTipAppTheme is a composable function.
    The MyApp function is going to take in a composable as a parameter.
 */
@Composable
private fun MyApp(content: @Composable () -> Unit) {
    JetpackTipAppTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}

@Composable
fun TopHeader(totalPerPerson: Double = 0.0) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(shape = CircleShape.copy(all = CornerSize(12.dp))),
        color = Color(0xFFe9d7f7)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            val total = "%.2f".format(totalPerPerson)
            Text(text = "Total Per Person", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "$$total",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Preview(showBackground = true)
@Composable
fun MainContent() {
    BillForm(){ billAmt ->

    }
}

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun BillForm(modifier: Modifier = Modifier, onValChange: (String) -> Unit = {}) {
    val totalBillState = remember { mutableStateOf("") }
    val validState = remember(totalBillState.value) {
        totalBillState.value.trim().isNotEmpty()
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    Surface(
        modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        border = BorderStroke(width = 2.dp, color = Color.LightGray)
    ) {
        Column(

        ) {
            InputField(
                valueState = totalBillState,
                labelId = "Enter Bill",
                enabled = true,
                isSingleLine = true,
                onAction = KeyboardActions {
                    if (!validState) return@KeyboardActions
                    onValChange(totalBillState.value.trim())
                    keyboardController?.hide()
                }
            )
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTipAppTheme {
        MyApp {
            Text(text = "Hello Again")
        }
    }
}