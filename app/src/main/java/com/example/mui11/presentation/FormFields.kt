package com.example.mui11.presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun FormFields() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    OutlinedTextField(
        value = username,
        onValueChange = { username = it },
        label = { Text("Użytkownik") },
        modifier = Modifier.fillMaxWidth()
    )

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Hasło") },
        visualTransformation = PasswordVisualTransformation(),
        modifier = Modifier.fillMaxWidth()
    )

    OutlinedTextField(
        value = description,
        onValueChange = { description = it },
        label = { Text("Opis") },
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    )
}
