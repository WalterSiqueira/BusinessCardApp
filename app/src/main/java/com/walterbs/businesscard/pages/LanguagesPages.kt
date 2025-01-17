package com.walterbs.businesscard.pages

import android.content.res.Resources
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LaguagePage() {
    val deviceLanguage = Resources.getSystem().configuration.locales[0].language
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            if (deviceLanguage == "pt") {
                Text(
                    text = "Idiomas que eu falo",
                    color = Color(0xFFFFFFFF),
                    fontSize = 30.sp
                )
            } else {
                Text(
                    text = "Languages that i speak",
                    color = Color(0xFFFFFFFF),
                    fontSize = 30.sp
                )
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                if (deviceLanguage == "pt") {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Inglês - Fluente",
                        color = Color(0xFFFFFFFF),
                        fontSize = 23.sp
                    )
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Português Brasileiro - Lingua matérna",
                        color = Color(0xFFFFFFFF),
                        fontSize = 23.sp
                    )
                } else {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "English - Fluent",
                        color = Color(0xFFFFFFFF),
                        fontSize = 23.sp
                    )
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Brasilean Portuguese - Mother language",
                        color = Color(0xFFFFFFFF),
                        fontSize = 23.sp
                    )
                }
            }
        }
    }
}