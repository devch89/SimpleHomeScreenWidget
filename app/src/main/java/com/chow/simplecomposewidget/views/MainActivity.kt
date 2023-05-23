package com.chow.simplecomposewidget.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.chow.simplecomposewidget.views.ui.theme.SimpleComposeWidgetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposeWidgetTheme {
            }
        }
    }
}

