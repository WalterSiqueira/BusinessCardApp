package com.walterbs.businesscard.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DrawerContent(navController: NavController, modifier: Modifier = Modifier) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 150.dp)
    ) {
        Column {
            Text(
                text = "Home",
                fontSize = 35.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .clickable { navController.navigate("home") }
                    .padding(25.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "Experiences",
                fontSize = 35.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .clickable { navController.navigate("experiences") }
                    .padding(25.dp)
                    .fillMaxWidth()
            )
        }
    }
}