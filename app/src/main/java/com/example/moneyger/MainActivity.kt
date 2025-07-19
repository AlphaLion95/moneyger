package com.example.moneyger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.moneyger.ui.MainScreen
import com.example.moneyger.ui.theme.MoneygerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneygerTheme {
                MainScreen() // Uses the one from com.example.moneyger.ui
            }
        }
    }
}
