package com.mesquita.composeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mesquita.composeclass.ui.screens.MyScaffold
import com.mesquita.composeclass.ui.screens.numberguess.NumberGuessScreenRoot
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeClassTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NumberGuessScreenRoot(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview
@Composable
private fun MyScaffoldPrev() {
    MyScaffold()
}