package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.model.BudgetCard
import com.ofamosoron.caju_clone.model.EventUiAttr
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme
import com.ofamosoron.caju_clone.ui.theme.HomeOfficeCardColor

@Composable
fun CCBudgetCard(
    budgetCard: BudgetCard
) {
    Column(
        modifier = Modifier
            .width(120.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(budgetCard.eventUiAttr.color)
            .padding(16.dp)
    ) {
        Icon(budgetCard.eventUiAttr.icon, contentDescription = "Home office icon")
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "R$", style = MaterialTheme.typography.labelSmall)
        Text(text = budgetCard.budgetValue.uppercase(), style = MaterialTheme.typography.labelLarge)
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = budgetCard.label.uppercase(), style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
fun CCBudgetCardPreview() {
    Caju_cloneTheme {
        CCBudgetCard(
            BudgetCard(
                label = "Home office",
                eventUiAttr = EventUiAttr(
                    color = HomeOfficeCardColor,
                    icon = Icons.Outlined.Home,
                ),
                budgetValue = "10,00"
            )
        )
    }
}
