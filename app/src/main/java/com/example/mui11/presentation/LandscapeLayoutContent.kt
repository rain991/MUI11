package com.example.mui11.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LandscapeLayoutContent(modifier : Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        val columnFieldModifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        FormFields(
            usernameFieldModifier = columnFieldModifier,
            passwordFieldModifier = columnFieldModifier,
            descriptionFieldModifier = columnFieldModifier
        )
        FloatingActionButton(
            onClick = { },
            modifier = Modifier
                .padding(16.dp)
        ) {
            Icon(imageVector = Icons.Default.Send, contentDescription = "Send")
        }
    }
}