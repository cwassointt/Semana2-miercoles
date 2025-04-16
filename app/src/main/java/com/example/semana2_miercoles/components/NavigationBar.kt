package com.example.semana2_miercoles.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun NavigationBar(nav:NavHostController) {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            label = { Text(text = "Inicio") },
            onClick = {},
            icon = { Icon(Icons.Default.Email,
                contentDescription = null) }
        )

        NavigationBarItem(
            selected = false,
            label = { Text(text = "User") },
            onClick = {},
            icon = { Icon(Icons.Default.Person,
                contentDescription = null) }
        )

        NavigationBarItem(
            selected = true,
            label = { Text(text = "Close") },
            onClick = { nav.popBackStack()},
            icon = { Icon(Icons.Default.Close,
                contentDescription = null) }
        )

    }
}