package com.sysfel.androidcourse.ui.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.sysfel.androidcourse.ui.pages.BuNotFoundPage
import com.sysfel.androidcourse.ui.pages.BuPage
import com.sysfel.androidcourse.ui.pages.BuVehicleTypePage
import com.sysfel.androidcourse.ui.pages.BuWhereToBuPage

enum class Pages(val title: String, val icon: ImageVector, val content: BuPage) {
    WHERE_TO(title = "Where to?", Icons.Filled.LocationOn, BuWhereToBuPage),
    VEHICLE_TYPE(title = "Vehicle Type", Icons.Filled.Search, BuVehicleTypePage),
    DATE_TIME(title = "Date & Time", Icons.Filled.DateRange, BuNotFoundPage),
    YOUR_INFO(title = "Your info", Icons.Filled.Place, BuNotFoundPage),
    VIEW_ORDER(title = "View Order", Icons.Filled.Person, BuNotFoundPage),
    ORDER_PAY(title = "Order & Pay", Icons.Filled.ShoppingCart, BuNotFoundPage)
}

@Composable
fun BuContent(index: Int = 0, innerPadding: PaddingValues) {

    var selectedItem by remember { mutableIntStateOf(index) }

    Column(
        modifier = Modifier.padding(innerPadding)
    ) {
        Row {
            BuSideBar(selectedItem) { selectedItem = it }
            BuBody(selectedItem) { selectedItem = it }
        }
    }
}

@Composable
fun BuSideBar(selectedItem: Int, onItemSelected: (Int) -> Unit) {
    NavigationRail() {
        Pages.values().forEachIndexed { index, item ->
            NavigationRailItem(
                icon = { Icon(item.icon, contentDescription = item.title, tint = MaterialTheme.colorScheme.primary) },
                label = { Text(text = item.title, color = MaterialTheme.colorScheme.primary) },
                selected = selectedItem == index,
                onClick = { onItemSelected(index) },
            )
        }
    }
}

@Composable
fun BuBody(selectedItem: Int, onItemSelected: (Int) -> Unit) {
    Card(
        Modifier.fillMaxSize().padding(end = 8.dp, bottom = 8.dp)) {
        Pages.values()[selectedItem].content.PageComposable(
            index = selectedItem,
            onItemSelected = onItemSelected
        )
    }
}