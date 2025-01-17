package com.walterbs.businesscard.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.walterbs.businesscard.components.Links
import com.walterbs.businesscard.components.ProfPic
import com.walterbs.businesscard.components.Texts

@SuppressLint("SwitchIntDef")
@Composable
fun MainContentEN() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize() // Preenche toda a tela
                    .padding(top = 25.dp)
                    .verticalScroll(rememberScrollState()) // Permite rolagem se o conteúdo exceder a tela
            ) {
                ProfPic()
                Texts(title = "Walter Siqueira", subTitle = "Mobile Developer")
                Links()
            }
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Row {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        ProfPic()
                        Texts(title = "Walter Siqueira", subTitle = "Desenvolvedor Mobile")
                    }
                    Column {
                        Links()
                    }
                }
            }
        }
    }
}