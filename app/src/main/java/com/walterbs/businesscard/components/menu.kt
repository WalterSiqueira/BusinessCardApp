package com.walterbs.businesscard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.walterbs.businesscard.R

@Composable
fun MenuBtn() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Image(
                painter = painterResource(id = R.drawable.configuracao),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(0.5f)
                    .padding(start = 50.dp, top = 10.dp)

            )
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Image(
                painter = painterResource(id = R.drawable.configuracao),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .padding(start = 350.dp)

            )
        }
    }
}