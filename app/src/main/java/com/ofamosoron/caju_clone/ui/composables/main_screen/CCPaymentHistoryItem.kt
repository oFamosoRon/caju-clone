package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.model.CCEventType
import com.ofamosoron.caju_clone.model.EventUiAttr
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme
import com.ofamosoron.caju_clone.ui.theme.FoodCardColor

@Composable
fun CCPaymentHistoryItem(
    label: String,
    eventTime: String,
    eventPrice: String,
    eventUiAttr: EventUiAttr
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            CCPaymentEventIcon(eventUiAttr)
            Spacer(modifier = Modifier.padding(6.dp))
            Column {
                Text(text = label.uppercase())
                Text(
                    text = eventTime,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Light
                )
            }
        }
        Text(
            text = "-R$ $eventPrice", style = MaterialTheme.typography.labelLarge,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CCPaymentHistoryItemPreview() {
    Caju_cloneTheme {
        CCPaymentHistoryItem(
            label = "PADARIA LUZITANA",
            eventTime = "06/10/1994 - 00:07",
            eventPrice = "5,50",
            eventUiAttr = EventUiAttr(icon = Icons.Outlined.ShoppingCart, color = FoodCardColor)
        )
    }
}

@Composable
fun CCPaymentEventIcon(eventUiAttr: EventUiAttr) {
    Icon(
        eventUiAttr.icon,
        contentDescription = "icon",
        modifier = Modifier
            .clip(CircleShape)
            .background(eventUiAttr.color)
            .padding(6.dp)
            .size(20.dp)
    )
}

@Preview
@Composable
fun CCPaymentEventIconPreview() {
    Caju_cloneTheme {
        CCPaymentEventIcon(
            EventUiAttr(icon = Icons.Outlined.ShoppingCart, color = FoodCardColor)
        )
    }
}