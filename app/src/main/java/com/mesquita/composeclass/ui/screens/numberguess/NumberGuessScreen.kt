package com.mesquita.composeclass.ui.screens.numberguess

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mesquita.composeclass.ui.theme.ComposeClassTheme

@Composable
fun NumberGuessScreenRoot(modifier: Modifier) {
    val viewModel = viewModel<NumberGuessViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()

    NumberGuessScreen(
        modifier = modifier,
        state = state,
        onEvent = viewModel::onEvents
    )
}

@Composable
fun NumberGuessScreen(
    modifier: Modifier = Modifier,
    state: NumberGuessState,
    onEvent: (NumberGuessEvents) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        TextField(
            value = state.numberText,
            onValueChange = { newText ->
                onEvent(NumberGuessEvents.OnNumberTextChange(newText = newText))
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Button(onClick = { onEvent(NumberGuessEvents.OnGuessClick) }) {
            Text("Advinhar")
        }

        if (state.guessText != null)
            Text(state.guessText)

        if (state.isGuessCorrect)
            Button(onClick = { onEvent(NumberGuessEvents.OnStartNewGameButtonClick)}) {
                Text("Resetar jogo")
            }
    }
}

@Preview(showBackground = true)
@Composable
private fun NumberGuessScreenPreview() {
    ComposeClassTheme {
        NumberGuessScreen(
            state = NumberGuessState("", "", false),
            onEvent = { }
        )
    }
}