package com.mesquita.composeclass.ui.screens.animations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mesquita.composeclass.ui.screens.commonAnimations.myEnterTransition
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

@Composable
fun AnimatedVisibilityDemo(modifier: Modifier = Modifier) {
    var toggle by remember { mutableStateOf(false) }

    Column(modifier = modifier.fillMaxSize()) {
        Button(
            onClick = { toggle = !toggle }
        ) {
            Text("Toggle")
        }

        AnimatedVisibility(
            visible = toggle,
            enter = myEnterTransition(),
            exit = scaleOut(
                animationSpec = tween(durationMillis = 3000)
            )
        ) {
            Text(
                text = "Hello world",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp)
                    .border(
                        width = 4.dp,
                        color = Color.Red
                    )
                    .wrapContentSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AnimatedVisibilityDemoPreview() {
    ComposeClassTheme {
        AnimatedVisibilityDemo()
    }
}