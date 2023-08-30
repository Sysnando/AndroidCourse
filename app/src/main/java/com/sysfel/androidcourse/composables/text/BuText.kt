package com.sysfel.androidcourse.composables.text

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BuText(text: String) {
    Text(text = text, Modifier.padding(16.dp))
}