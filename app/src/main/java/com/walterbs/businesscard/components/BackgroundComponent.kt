package com.walterbs.businesscard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.walterbs.businesscard.R

@Composable
fun BgImg() {
    Image(
        painter = painterResource(id = R.drawable._823ba68_b387_40d8_9b39_d9022ef863c7),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
}