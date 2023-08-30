package com.sysfel.androidcourse.composables.text

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BuTextTitle(text: String) {
    Text(
        text = text,
        style = androidx.compose.ui.text.TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 42.sp,
            color = MaterialTheme.colorScheme.primary
        ),
        modifier = Modifier.padding(16.dp)
    )
}