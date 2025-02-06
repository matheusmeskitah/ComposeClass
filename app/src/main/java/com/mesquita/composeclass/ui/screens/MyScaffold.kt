package com.mesquita.composeclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffold(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Meu titulo") })
        },
        bottomBar = { BottomAppBar { } },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = null)
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text("Qualquer coisa")
        }
    }
}

@Preview
@Composable
private fun MyScaffoldPreview() {
    ComposeClassTheme {
        MyScaffold()
    }
}