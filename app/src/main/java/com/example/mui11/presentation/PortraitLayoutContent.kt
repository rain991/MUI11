package com.example.mui11.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun PortraitLayoutContent(modifier : Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val rowFieldModifier = Modifier
            FormFields(
                usernameFieldModifier = rowFieldModifier,
                passwordFieldModifier = rowFieldModifier,
                descriptionFieldModifier = rowFieldModifier
            )
        }
        FloatingActionButton(
            onClick = { },
            modifier = Modifier
                .padding(16.dp)
        ) {
            Icon(imageVector = Icons.Default.Send, contentDescription = "Send")
        }
    }
}