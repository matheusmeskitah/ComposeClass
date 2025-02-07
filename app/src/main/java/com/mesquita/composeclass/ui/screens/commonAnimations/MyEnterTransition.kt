package com.mesquita.composeclass.ui.screens.commonAnimations

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn

fun myEnterTransition(): EnterTransition {
    return scaleIn(
        animationSpec = tween(3000, easing = LinearEasing)
    ) + fadeIn()
}