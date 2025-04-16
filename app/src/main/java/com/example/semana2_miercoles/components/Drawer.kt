package com.example.semana2_miercoles.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.semana2_miercoles.R

@Composable
fun Drawer(nav:NavController) {
    Box(
        modifier = Modifier
            .height(180.dp)
            .width(180.dp)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id=R.drawable.persona),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
                .size(128.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
    }

    Text (
        text = "UPC MOVIL",
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )

    HorizontalDivider()
    Spacer(modifier = Modifier.height(16.dp))

    NavigationDrawerItem(
        icon = {
            Icon (imageVector = Icons.Rounded.AccountCircle,
                contentDescription = null)
        },
        label = {
            Text(text = "Account",
                fontSize = 17.sp,
                modifier = Modifier.padding(16.dp))
        },
        selected = false,
        onClick = {}
    )

    NavigationDrawerItem(
        icon = {
            Icon (imageVector = Icons.Rounded.Notifications,
                contentDescription = null)
        },
        label = {
            Text(text = "Notifications",
                fontSize = 17.sp,
                modifier = Modifier.padding(16.dp))
        },
        selected = false,
        onClick = {}
    )


    NavigationDrawerItem(
        icon = {
            Icon (imageVector = Icons.Rounded.Home,
                contentDescription = null)
        },
        label = {
            Text(text = "Home",
                fontSize = 17.sp,
                modifier = Modifier.padding(16.dp))
        },
        selected = false,
        onClick = {}
    )

    NavigationDrawerItem(
        icon = {
            Icon (imageVector = Icons.Rounded.Settings,
                contentDescription = null)
        },
        label = {
            Text(text = "Settings",
                fontSize = 17.sp,
                modifier = Modifier.padding(16.dp))
        },
        selected = false,
        onClick = {}
    )


    Spacer(modifier = Modifier.height(40.dp))
    HorizontalDivider()
    Spacer(modifier = Modifier.height(40.dp))

    NavigationDrawerItem(
        icon = {
            Icon (imageVector = Icons.Rounded.Close,
                contentDescription = null)
        },
        label = {
            Text(text = "Close",
                fontSize = 17.sp,
                modifier = Modifier.padding(16.dp))
        },
        selected = false,
        onClick = {}
    )



}