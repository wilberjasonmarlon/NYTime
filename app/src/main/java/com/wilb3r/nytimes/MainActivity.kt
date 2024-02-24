package com.wilb3r.nytimes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wilb3r.nytimes.composables.NYTAppBar
import com.wilb3r.nytimes.ui.navigation.NYTNavHost
import com.wilb3r.nytimes.ui.navigation.currentTopLevelDestination
import com.wilb3r.nytimes.ui.theme.NYTimesTheme
import dagger.hilt.android.AndroidEntryPoint


@OptIn(
    ExperimentalMaterial3Api::class
)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NYTimesTheme {
                Scaffold(
                    snackbarHost = {},
                    bottomBar = {}
                ) { paddingValues ->
                    Column(
                        Modifier
                            .fillMaxSize()
                            .padding(paddingValues)) {

                        val destination = navController
                            .currentBackStackEntryAsState().value?.destination
                        if (destination != null) {
                            NYTAppBar(
                                title = currentTopLevelDestination(destination),
                                actionIcon = null,
                                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                                    containerColor = Color.Transparent,
                                ),
                                onActionClick = null,
                                modifier = Modifier
                            )
                        }

                        NYTNavHost(navController = navController, modifier = Modifier.fillMaxSize())
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ScreenTitle(
    /*@StringRes */title: String = "Section",
    @DrawableRes image: Int? = R.drawable.ico_top1,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ico_top1),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .align(alignment = Alignment.CenterVertically)
        )
        Text(
            //text = stringResource(id = title),
            text = title,
            style = MaterialTheme.typography.headlineMedium
                .copy(fontStyle = FontStyle.Italic)
        )

    }

}

@Composable
fun TopBar(
    title: String,

    ) {

}
