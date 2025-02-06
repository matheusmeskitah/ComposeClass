package com.mesquita.composeclass.ui.screens.numberguess

sealed interface NumberGuessEvents {
    data object OnGuessClick: NumberGuessEvents
    data class OnNumberTextChange(val newText: String): NumberGuessEvents
    data object OnStartNewGameButtonClick: NumberGuessEvents
}