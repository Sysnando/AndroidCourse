package com.sysfel.androidcourse.composables.cards

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sysfel.androidcourse.composables.text.BuText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuCards(title: String, onClick: () -> Unit) {
    Card(
        onClick = onClick,
    ) {
        BuText(title)
    }
}