package com.walterbs.businesscard

import android.app.LocaleConfig
import android.content.res.Configuration
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.walterbs.businesscard.ui.theme.BusinessCardTheme

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
                    .padding(top = 15.dp)
            )
        }
    }
}

@Composable
fun ProfPic() {

    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 230.dp)
                    .clip(RoundedCornerShape(50.dp))
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

@Composable
fun Texts(title: String, subTitle: String) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 46.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
                )
                Text(
                    text = subTitle,
                    fontSize = 34.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
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
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
                )
                Text(
                    text = subTitle,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
                )
            }
        }
    }
}

@Composable
fun GithubLink() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(0.13f)
                        .padding(end = 10.dp)
                )
                Text(
                    text = "https://github.com/WalterSiqueira",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
                )
            }
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(0.13f)
                        .padding(end = 10.dp)
                )
                Text(
                    text = "https://github.com/WalterSiqueira",
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
                )
            }
        }
    }
}

@Composable
fun GmailLink() {
    val configuration = LocalConfiguration.current
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
                    text = "walterbarbozasiqueira@gmail.com",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
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
                    text = "walterbarbozasiqueira@gmail.com",
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFFFFF)
                )
            }
        }
    }
}

@Composable
fun Links() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 150.dp, bottom = 16.dp, start = 25.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    GithubLink()
                    GmailLink()
                }
            }
        }
        android.content.res.Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 130.dp, bottom = 16.dp, start = 0.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    GithubLink()
                    GmailLink()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        android.content.res.Configuration.ORIENTATION_PORTRAIT -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize() // Preenche toda a tela
                    .verticalScroll(rememberScrollState()) // Permite rolagem se o conteúdo exceder a tela
            ) {
                AppTitle(title = "Business Card")
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
                AppTitle(title = "Business Card")
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
    device = "spec:width=411dp,height=900dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
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
