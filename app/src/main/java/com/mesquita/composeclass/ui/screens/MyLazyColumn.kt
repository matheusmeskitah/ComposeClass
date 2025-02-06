package com.mesquita.composeclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(100) { i ->
            Text("Text $i")
            println(i)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MyLazyColumnPreview() {
    MyLazyColumn()
}