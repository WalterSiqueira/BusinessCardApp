package com.walterbs.businesscard.components

import android.content.res.Resources
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    onOpenDrawer: () -> Unit,
) {
    val deviceLang = Resources.getSystem().configuration.locales[0].language
    TopAppBar(
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .clickable { onOpenDrawer() }
                    .size(50.dp, 50.dp)
            )
        },
        title = {
            Box (
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                if (deviceLang == "pt") {
                    Text(
                        text = "Cartão Profissional",
                        fontSize = 30.sp,
                        color = Color(0xFFFFFFFF)

                    )
                } else {
                    Text(
                        text = "Business Card",
                        fontSize = 30.sp,
                        color = Color(0xFFFFFFFF)

                    )
                }
            }
        },
        colors = androidx.compose.material3.TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent // Define o fundo transparente
        )
    )
}