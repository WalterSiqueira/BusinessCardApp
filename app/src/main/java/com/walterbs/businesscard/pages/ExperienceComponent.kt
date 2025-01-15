package com.walterbs.businesscard.pages

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

@Composable
fun ExperienceField() {
    Box {
        Column {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 55.dp, bottom = 20.dp)
                    .fillMaxWidth(),

                ) {
                Text(
                    text = "Experiências Profissionais",
                    color = Color(0xFFFFFFFF),
                    fontSize = 50.sp
                )
            }
            Column {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 15.dp, 8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Empresa:",
                        color = Color(0xFFFFFFFF),
                        fontSize = 30.sp
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 8.dp, 8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Sociedade Beneficente São Camilo",
                        color = Color(0xFFFFFFFF),
                        fontSize = 23.sp
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 15.dp, 8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Duração:",
                        color = Color(0xFFFFFFFF),
                        fontSize = 30.sp
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "10/2023 - 01/2025",
                        color = Color(0xFFFFFFFF),
                        fontSize = 23.sp
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 15.dp, 8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Função:",
                        color = Color(0xFFFFFFFF),
                        fontSize = 30.sp
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 20.dp, 8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Responsável por organizar o ambiente e os documentos, suporte " +
                                "com computadores e periféricos, edição de planilhas e documentos educativos.",
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                        fontSize = 23.sp
                    )
                }
            }
        }
    }
}