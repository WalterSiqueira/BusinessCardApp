package com.walterbs.businesscard.components

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.walterbs.businesscard.R

@SuppressLint("SwitchIntDef")
@Composable
fun GmailLink(link: String) {
    val configuration = LocalConfiguration.current
    val context = LocalContext.current
    val clipboardManager = LocalClipboardManager.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gmail),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(0.13f)
                        .padding(end = 10.dp)
                )
                Text(
                    text = link,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clickable {
                            clipboardManager.setText((androidx.compose.ui.text.AnnotatedString(link)))
                            Toast
                                .makeText(context, "Email copiado!", Toast.LENGTH_SHORT)
                                .show()
                        },
                    textAlign = TextAlign.Center,
                )
            }
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gmail),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(0.13f)
                        .padding(end = 10.dp)
                )
                Text(
                    text = link,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clickable {
                            clipboardManager.setText((androidx.compose.ui.text.AnnotatedString(link)))
                            Toast
                                .makeText(context, "Email copiado!", Toast.LENGTH_SHORT)
                                .show()
                        },
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}