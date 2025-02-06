package com.mesquita.composeclass.ui.screens.numberguess

data class NumberGuessState(
    val numberText: String = "",
    val guessText: String? = "",
    val isGuessCorrect: Boolean = false
)
