package com.mesquita.composeclass.ui.screens.animations

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

@Composable
fun AnimateContentSizeDemo(modifier: Modifier = Modifier) {
    var toggle by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = {
                toggle = !toggle
            }
        ) {
            Text("Toggle")
        }

        Box(
            modifier = Modifier
                .background(Color.Blue)
                .animateContentSize()
                .height(if (toggle) 400.dp else 200.dp)
                .fillMaxWidth()
        )

        Text(
            text = "Hello world",
            modifier = Modifier
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun AnimateContentSizeDemoPreview() {
    ComposeClassTheme {
        AnimateContentSizeDemo()
    }
}