package com.walterbs.businesscard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.walterbs.businesscard.R

@Composable
fun ProfPic() {

    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .absoluteOffset(100.dp, 125.dp)
                    .zIndex(1f)
                    .clip(RoundedCornerShape(50.dp))
                    .size(200.dp, 200.dp)
            )
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(0.2f)
                    .padding(top = 5.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
        }
    }
}