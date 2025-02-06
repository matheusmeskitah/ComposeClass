package com.mesquita.composeclass.ui.screens.numberguess

import androidx.lifecycle.ViewModel
import kotlin.random.Random
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NumberGuessViewModel: ViewModel() {

    private val _state = MutableStateFlow(NumberGuessState())
    val state = _state.asStateFlow()

    private var number = Random.nextInt(1, 101)
    private var tentativas = 0

    fun onEvents(events: NumberGuessEvents) {
        when(events) {
            NumberGuessEvents.OnGuessClick -> {
                val guess = state.value.numberText.toIntOrNull()
                if (guess != null)
                    tentativas++

                _state.update { it.copy(
                    guessText = when {
                        guess == null -> "Digite o número"
                        number > guess -> "Não, meu número é maior"
                        number < guess -> "Não, meu número é menor"
                        else -> "Na Mosca! Voce precisou de $tentativas tentativas."
                    },
                    isGuessCorrect = guess == number,
                    numberText = ""
                ) }
            }

            is NumberGuessEvents.OnNumberTextChange -> {
                _state.update { it.copy(numberText = events.newText) }
            }

            NumberGuessEvents.OnStartNewGameButtonClick -> {
                number = Random.nextInt(1, 101)

                _state.update { it.copy(
                    numberText = "",
                    guessText = null,
                    isGuessCorrect = false
                ) }
            }
        }
    }
}