package com.example.semana2_miercoles.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.semana2_miercoles.components.Drawer
import com.example.semana2_miercoles.components.NavigationBar
import com.example.semana2_miercoles.components.TopBar
import kotlinx.coroutines.launch

@Composable
fun View2(nav:NavHostController){

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed)

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Drawer(nav)
        }
    ) {
        Scaffold (
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopBar(
                    onOpenDrawer = {
                        scope.launch {
                            drawerState.apply{
                                if(isClosed) open() else close()
                            }
                        }
                    }
                )
            },
            bottomBar = {
                NavigationBar(nav)
            }
        ) {
            innerPadding -> Vista2(
                modifier = Modifier.padding(innerPadding), nav)
        }
    }

}

@Composable
fun Vista2(modifier: Modifier, nav: NavHostController) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .padding(vertical = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(text="Bienvenido al Sistema",
            fontSize = 30.sp,
            color = Color(56, 83, 122),
            fontWeight = FontWeight.Bold)

        Button(
           colors = ButtonDefaults.buttonColors(Color(56, 83, 122)),
            modifier = Modifier.padding(20.dp),
            onClick = {
                nav.popBackStack()
            }
        ) {
            Text(text="Salir",
                color = Color.White)
        }

    }
}