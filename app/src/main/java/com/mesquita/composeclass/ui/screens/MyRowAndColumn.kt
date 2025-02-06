package com.mesquita.composeclass.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MyRowAndColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        for (i in 0..100) {
            Text(text = "Texto $i")
            println(i)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MyRowAndColumnPreview() {
    ComposeClassTheme {
        MyRowAndColumn()
    }
}