package com.walterbs.businesscard.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.walterbs.businesscard.R

@SuppressLint("SwitchIntDef")
@Composable
fun Texts(title: String, subTitle: String) {
    val configuration = LocalConfiguration.current
    val monomaniacFont = FontFamily(Font(R.font.monomaniac_one))
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 150.dp, bottom = 50.dp)
            ) {
                Text(
                    text = title,
                    fontFamily = monomaniacFont,
                    fontSize = 56.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = subTitle,
                    fontFamily = monomaniacFont,
                    fontSize = 44.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                )
            }
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(top = 25.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 38.sp,
                    fontFamily = monomaniacFont,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = subTitle,
                    fontSize = 28.sp,
                    fontFamily = monomaniacFont,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}