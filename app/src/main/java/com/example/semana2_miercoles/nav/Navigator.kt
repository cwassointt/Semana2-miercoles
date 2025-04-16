package com.example.semana2_miercoles.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.semana2_miercoles.views.View1
import com.example.semana2_miercoles.views.View2

@Composable
fun Navigator() {
    val recordarPantalla = rememberNavController()

    NavHost(
        navController = recordarPantalla,
        startDestination = "P1"
    ) {
        composable("P1") { View1(recordarPantalla) }
        composable("P2") { View2(recordarPantalla) }
    }
}