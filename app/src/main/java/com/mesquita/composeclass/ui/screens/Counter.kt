package com.mesquita.composeclass.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

@Composable
fun Counter(count: Int, onCounterClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onCounterClick
        ) {
            Text("Contador: $count")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CounterPreview() {
    ComposeClassTheme {
        Counter(
            count = 0,
            onCounterClick = {  }
        )
    }
}