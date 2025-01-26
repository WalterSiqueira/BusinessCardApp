package com.walterbs.businesscard

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.walterbs.businesscard.components.DrawerContent
import com.walterbs.businesscard.components.ProfPic
import com.walterbs.businesscard.pages.ExperienceField
import com.walterbs.businesscard.components.TopBar
import com.walterbs.businesscard.pages.LaguagePage
import com.walterbs.businesscard.pages.MainContentEN
import com.walterbs.businesscard.pages.MainContentPTBR
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(
                modifier = Modifier.fillMaxSize() // Certifique-se de que o Box preenche toda a tela
            ) {
                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val deviceLang = Resources.getSystem().configuration.locales[0].language

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        if (navController.currentBackStackEntryAsState().value?.destination?.route == "home") {
            ProfPic()
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        )
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                if (drawerState.isOpen) {
                    DrawerContent(navController)
                }
            }
        ) {
            Scaffold(
                containerColor = Color.Transparent,
                topBar = {
                    // Removido o conteúdo aqui para dividir a altura no layout principal.
                }
            ) { padding ->
                BoxWithConstraints(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                ) {
                    val topBarHeight = maxHeight * 0.25f // 20% da altura total
                    val mainContentHeight = maxHeight * 1f // 80% da altura total

                    // TopBar ocupando 20% da tela
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(topBarHeight)
                    ) {
                        TopBar(
                            navController,
                            onOpenDrawer = {
                                scope.launch {
                                    drawerState.apply {
                                        if (isClosed) open() else close()
                                    }
                                }
                            }
                        )
                    }

                    // Conteúdo principal ocupando os 80% restantes
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(mainContentHeight)
                            .padding(top = topBarHeight) // Ajusta o conteúdo para não sobrepor a TopBar
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = "home"
                        ) {
                            if (deviceLang == "pt") {
                                composable("home") {
                                    MainContentPTBR()
                                }
                            } else {
                                composable("home") {
                                    MainContentEN()
                                }
                            }
                            composable("experiences") {
                                ExperienceField()
                            }
                            composable("languages") {
                                LaguagePage()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    //device = "spec:width=411dp,height=900dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
fun Preview() {
    Box(
        modifier = Modifier.fillMaxSize() // Certifique-se de que o Box preenche toda a tela
    ) {
        Screen()
    }
}
