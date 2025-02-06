package com.mesquita.composeclass.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mesquita.composeclass.R

val bodyFontFamily= FontFamily(
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_regular, FontWeight.Normal),
    Font(R.font.quicksand_medium, FontWeight.Medium),
    Font(R.font.quicksand_semibold, FontWeight.SemiBold),
    Font(R.font.quicksand_bold, FontWeight.Bold)
)

// Default Material 3 typography values
val baseline= Typography()

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = bodyFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = bodyFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = bodyFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = bodyFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = bodyFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = bodyFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = bodyFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = bodyFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = bodyFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily)
)