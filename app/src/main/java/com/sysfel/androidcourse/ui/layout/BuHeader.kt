package com.sysfel.androidcourse.ui.layout

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuTopBarApp() {
    TopAppBar(
        title = { Text(text = "SALMUERA") },
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu"
                )
            }
        },
        actions = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Menu"
                )
            }
        }
    )
}