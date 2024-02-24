package com.wilb3r.nytimes.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NYTAppBar(
    title: String,
    @DrawableRes navIcon: Int? = null,
    @DrawableRes actionIcon: Int? = null,
    modifier: Modifier,
    onNavClick: (() -> Unit )? = {},
    onActionClick: (() -> Unit)? = {},
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors()
) {
    CenterAlignedTopAppBar(
        title = { Text(text = title) },
        actions = {
            actionIcon?.let {
                IconButton(onClick = { onActionClick?.invoke() }) {
                    Icon(
                        painter = painterResource(id = it),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }
            }
        },
        navigationIcon = {
            navIcon?.let {
                IconButton(onClick = { onNavClick?.invoke() }) {
                    Icon(
                        painter = painterResource(id = it),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }
            }
        },
        colors = colors,
        modifier = modifier.testTag("nyTAppBar"),
    )
}