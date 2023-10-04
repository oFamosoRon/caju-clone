package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ofamosoron.caju_clone.ui.theme.AccentBlue
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

@Composable
fun CCBottomBar() {

    var menuSelected by rememberSaveable { mutableStateOf(MenuEntry.Benefits) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 18.dp, vertical = 8.dp)
    ) {
        BottomBarButton(
            isSelected = menuSelected.name == MenuEntry.Benefits.name,
            icon = Icons.Outlined.Home,
            name = "Benefícios"
        ) {
            menuSelected = MenuEntry.Benefits
        }
        BottomBarButton(
            isSelected = menuSelected.name == MenuEntry.Market.name,
            icon = Icons.Outlined.ShoppingCart,
            name = "Feirinha"
        ) {
            menuSelected = MenuEntry.Market
        }
        BottomBarButton(
            isSelected = menuSelected.name == MenuEntry.Cards.name,
            icon = Icons.Outlined.MailOutline,
            name = "Cartões"
        ) {
            menuSelected = MenuEntry.Cards
        }
    }
}

@Composable
private fun BottomBarButton(
    isSelected: Boolean,
    name: String,
    icon: ImageVector,
    onClick: () -> Unit
) {
    val color = if (isSelected) {
        AccentBlue
    } else {
        Color.Gray
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable { onClick() }
    ) {

        Icon(imageVector = icon, contentDescription = name, tint = color)
        Text(
            text = name, style = TextStyle(
                color = color,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            ), modifier =
            Modifier.padding(bottom = 4.dp)
        )
        if (isSelected) {
            Divider(
                thickness = 4.dp, color = AccentBlue, modifier = Modifier
                    .width(22.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(5.dp)))
            )
        }
    }
}

enum class MenuEntry {
    Benefits, Market, Cards
}

@Preview(showBackground = true)
@Composable
fun CCButtonBarPreview() {
    Caju_cloneTheme {
        CCBottomBar()
    }
}
