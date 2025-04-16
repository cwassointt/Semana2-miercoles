package com.example.semana2_miercoles.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun BottomApp(nav: NavHostController){

    BottomAppBar (
        actions = {

            IconButton(
                onClick = {}
            ) {
                Icon(Icons.Default.Person,
                    contentDescription = null)
            }

            IconButton(
                onClick = {}
            ) {
                Icon(Icons.Default.Email,
                    contentDescription = null)
            }

            IconButton(
                onClick = {}
            ) {
                Icon(Icons.Default.Notifications,
                    contentDescription = null)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.Blue,
                elevation = FloatingActionButtonDefaults.
                bottomAppBarFabElevation()
            ) {
                Icon(Icons.Filled.Settings, null)
            }
        }
    )
}