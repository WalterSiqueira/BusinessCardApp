package com.walterbs.businesscard.components

import android.content.res.Resources
import androidx.compose.foundation.border
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
    val deviceLang = Resources.getSystem().configuration.locales[0].language
    Box (
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 150.dp)
    ) {
        Column {

            if (deviceLang == "pt") {
                Text(
                    text = "Página Inicial",
                    fontSize = 35.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .clickable { navController.navigate("home") }
                        .padding(25.dp)
                        .border(2.dp, Color.Black)
                        .fillMaxWidth()
                )
                Text(
                    text = "Experiencias",
                    fontSize = 35.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .clickable { navController.navigate("experiences") }
                        .padding(25.dp)
                        .border(2.dp, Color.Black)
                        .fillMaxWidth()
                )
                Text(
                    text = "Idiomas",
                    fontSize = 35.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .clickable { navController.navigate("languages") }
                        .padding(25.dp)
                        .border(2.dp, Color.Black)
                        .fillMaxWidth()
                )
            } else {
                Text(
                    text = "Home",
                    fontSize = 35.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .clickable { navController.navigate("home") }
                        .padding(25.dp)
                        .border(2.dp, Color.Black)
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
                        .border(2.dp, Color.Black)
                        .fillMaxWidth()
                )
                Text(
                    text = "Languages",
                    fontSize = 35.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .clickable { navController.navigate("languages") }
                        .padding(25.dp)
                        .border(2.dp, Color.Black)
                        .fillMaxWidth()
                )
            }
        }
    }
}