package com.walterbs.businesscard.components

import android.content.res.Resources
import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.walterbs.businesscard.R
import kotlin.math.round

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    navController: NavController,
    onOpenDrawer: () -> Unit,
) {
    val deviceLang = Resources.getSystem().configuration.locales[0].language
    val currentPage = navController.currentBackStackEntryAsState().value?.destination?.route
    Image(
        painter = painterResource(id = R.drawable.fundo2), // Substitua pelo seu recurso de imagem
        contentDescription = null,
        contentScale = ContentScale.Crop, // Faz com que a imagem preencha o espaço sem deformar
        modifier = Modifier.fillMaxSize() // Faz a imagem ocupar toda a área disponível
    )
    TopAppBar(
            modifier = Modifier
                .padding(top = 25.dp)
                .fillMaxWidth(),
            navigationIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.menu_principal),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .clickable { onOpenDrawer() }
                        .padding(start = 25.dp)
                        .size(70.dp, 70.dp)
                )
            },
            title = {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (deviceLang == "pt") {
                        if (currentPage == "home") {
                            Text(
                                text = "Home Page",
                                fontSize = 36.sp

                            )
                        } else if (currentPage == "experiences") {
                            Text(
                                text = "Experiences Page",
                                fontSize = 36.sp

                            )
                        } else if (currentPage == "languages") {
                            Text(
                                text = "Languages Page",
                                fontSize = 36.sp

                            )
                        }
                    } else {
                        if (currentPage == "home") {
                            Text(
                                text = "Página Principal",
                                fontSize = 36.sp

                            )
                        } else if (currentPage == "experiences") {
                            Text(
                                text = "Página de Experiências",
                                fontSize = 36.sp

                            )
                        } else if (currentPage == "languages") {
                            Text(
                                text = "Página de Idiomas",
                                fontSize = 36.sp

                            )
                        }
                    }

                }
        },
        colors = androidx.compose.material3.TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent // Define o fundo transparente
        )
    )
}