package com.sysfel.androidcourse.ui.pages

import androidx.compose.runtime.Composable

sealed interface BuPage {

    @Composable
    fun PageComposable(index: Int, onItemSelected: (Int) -> Unit)
}