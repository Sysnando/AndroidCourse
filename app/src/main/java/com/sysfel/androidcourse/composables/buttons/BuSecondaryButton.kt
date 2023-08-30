package com.sysfel.androidcourse.composables.buttons

import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sysfel.androidcourse.composables.text.BuText

@Composable
fun BuSecondaryButton(text: String, modifier: Modifier, onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick ,
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.secondary
    ) {
        BuText(text)
    }
}
