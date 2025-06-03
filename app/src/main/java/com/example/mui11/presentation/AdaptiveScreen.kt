package com.example.mui11.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun AdaptiveScreen(modifier: Modifier) {
    val configuration = LocalConfiguration.current
    val isPortrait =
        configuration.orientation == android.content.res.Configuration.ORIENTATION_PORTRAIT

    Column(modifier = modifier) {
        Text(
            text = "Adaptive Layout",
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.W600),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 24.dp),
            textAlign = TextAlign.Center
        )

        if (isPortrait) {
            LandscapeLayoutContent(modifier = modifier)
        } else {
            PortraitLayoutContent(modifier = modifier)
        }
    }
}
