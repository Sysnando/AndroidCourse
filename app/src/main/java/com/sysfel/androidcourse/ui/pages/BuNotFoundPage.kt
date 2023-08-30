package com.sysfel.androidcourse.ui.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sysfel.androidcourse.composables.buttons.BuSecondaryButton
import com.sysfel.androidcourse.composables.cards.BuCards
import com.sysfel.androidcourse.composables.text.BuText
import com.sysfel.androidcourse.composables.text.BuTextTitle

data object BuNotFoundPage : BuPage {
    @Composable
    override fun PageComposable(index: Int, onItemSelected: (Int) -> Unit) {
        Box(Modifier.fillMaxSize()) {
            BuTextTitle("Page do not found")
            BuSecondaryButton(text = "PREVIOUS STEP", modifier = Modifier.padding(16.dp).align(Alignment.BottomStart)) {
                onItemSelected(index - 1)
            }
        }
    }
}
