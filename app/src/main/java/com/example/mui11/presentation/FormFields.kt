package com.example.mui11.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun FormFields(@SuppressLint("ModifierParameter") usernameFieldModifier : Modifier, passwordFieldModifier : Modifier, descriptionFieldModifier : Modifier) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    OutlinedTextField(
        value = username,
        onValueChange = { username = it },
        label = { Text("Użytkownik") },
        modifier = usernameFieldModifier,
        shape = RoundedCornerShape(16.dp)
    )

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Hasło") },
        visualTransformation = PasswordVisualTransformation(),
        modifier = passwordFieldModifier,
        shape = RoundedCornerShape(16.dp)
    )

    OutlinedTextField(
        value = description,
        onValueChange = { description = it },
        label = { Text("Opis") },
        modifier = descriptionFieldModifier,
        shape = RoundedCornerShape(16.dp)
    )
}
