package com.walterbs.businesscard

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.walterbs.businesscard.components.AppTitle
import com.walterbs.businesscard.components.BgImg
import com.walterbs.businesscard.components.Links
import com.walterbs.businesscard.components.ProfPic
import com.walterbs.businesscard.components.Texts

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(
                modifier = Modifier.fillMaxSize() // Certifique-se de que o Box preenche toda a tela
            ) {
                BgImg()
                MainContent()
            }
        }
    }
}


@SuppressLint("SwitchIntDef")
@Composable
fun MainContent() {
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
                Row {
                    AppTitle(title = "Business Card")
                }
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                ) {
                    AppTitle(title = "Business Card")
                }
                Row {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        ProfPic()
                        Texts(title = "Walter Siqueira", subTitle = "Mobile Developer")
                    }
                    Column {
                        Links()
                    }
                }
            }
        }
    }
}


@Preview(
    showBackground = true,
//    device = "spec:width=411dp,height=900dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
fun Preview() {
    Box(
        modifier = Modifier.fillMaxSize() // Certifique-se de que o Box preenche toda a tela
    ) {
        BgImg()
        MainContent()
    }
}
