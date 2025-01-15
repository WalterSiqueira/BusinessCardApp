package com.walterbs.businesscard.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("SwitchIntDef")
@Composable
fun AppTitle(title: String) {
    val configuration = LocalConfiguration.current

    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Text(
                text = title,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFFFFFFFF),
                modifier = Modifier
                    .padding(top = 15.dp)
            )
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Text(
                text = title,
                fontSize = 50.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFFFFFFFF),
                modifier = Modifier
                    .padding(top = 0.dp)
            )
        }
    }
}