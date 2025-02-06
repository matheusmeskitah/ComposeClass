package com.mesquita.composeclass.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

private var count = 0

@Composable
fun DataFlow() {
    var count by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Counter(count = count, onCounterClick = { count ++ })

        Button(onClick = {
            count = 0
        }) {
            Text("Reset counter")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DataFlowPreview() {
    ComposeClassTheme {
        DataFlow()
    }
}