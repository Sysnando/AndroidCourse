package com.sysfel.androidcourse.ui.layout

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppLayout() {
    Scaffold(
        topBar = { BuTopBarApp() },
        content = { innerPadding -> BuContent(innerPadding = innerPadding) },
    )
}