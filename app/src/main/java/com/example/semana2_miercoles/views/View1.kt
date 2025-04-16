package com.example.semana2_miercoles.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.semana2_miercoles.R
import com.example.semana2_miercoles.components.TopBar
import androidx.compose.ui.window.Dialog
import com.example.semana2_miercoles.components.BottomApp

@Composable
fun View1(nav:NavHostController) {


    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBar(
                onOpenDrawer = {}
            )
        },
        bottomBar = {
            BottomApp(nav)
        }
    ) {
        innerPadding -> Principal(
            modifier=Modifier.padding(innerPadding),
            nav
        )
    }
}

@Composable
fun Principal( modifier: Modifier, nav: NavHostController){

    var txtUsu by remember { mutableStateOf("user") }
    var txtPas by remember { mutableStateOf("user") }

    Column (
        modifier=Modifier
            .fillMaxSize()
            .padding(30.dp)
            .padding(vertical = 40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id= R.drawable.img),
            contentDescription = null,
            modifier = Modifier
                .height(250.dp)
                .width(250.dp)
                .padding(vertical = 30.dp)
        )

        Text(
            text = "Login Student",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = txtUsu,
            modifier = Modifier.padding(7.dp)
                .padding(vertical = 15.dp),
            label = {Text(text="User")},
            placeholder = {Text("Usuario")},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Face,
                    tint = Color.Gray,
                    contentDescription = ""
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    tint = Color.Blue,
                    contentDescription = null
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedContainerColor = Color.LightGray,
                unfocusedContainerColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            onValueChange = {txtUsu=it}
        )


        OutlinedTextField(
            value = txtPas,
            modifier = Modifier.padding(7.dp)
                .padding(vertical = 15.dp),
            label = {Text(text="Password")},
            placeholder = {Text("Password")},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    tint = Color.Gray,
                    contentDescription = ""
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    tint = Color.Blue,
                    contentDescription = null
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedContainerColor = Color.LightGray,
                unfocusedContainerColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = {txtPas=it}
        )

        var isDisplay by remember { mutableStateOf(false) }

        if(isDisplay) {
            Dialog(onDismissRequest={isDisplay=false}){
                Card (
                    modifier = Modifier
                        .height(300.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column (
                        modifier= Modifier
                            .fillMaxSize()
                            .padding(20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(text="Error",
                            fontSize = 25.sp,
                            color = Color.Red,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center)

                        Text(text="Usuario y/o Password incorrectos",
                            fontSize = 18.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center)
                        Button(
                            onClick = {
                                isDisplay=false
                            }
                        ) {
                            Text(text="Volver a Intentar",
                                fontSize = 25.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center)
                        }



                    }
                }
            }
        }






        ElevatedButton(
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .padding(10.dp)
                .padding(vertical = 10.dp)
                .width(300.dp),
            onClick = {
                if(txtUsu=="user" && txtPas=="user"){
                    nav.navigate("P2")
                } else {
                    isDisplay=true
                }
            }
        ) {
            Text(
                text = "Iniciar Sesion", fontSize = 20.sp,
                color = Color.White, fontWeight = FontWeight.Bold
            )
        }

    }
}