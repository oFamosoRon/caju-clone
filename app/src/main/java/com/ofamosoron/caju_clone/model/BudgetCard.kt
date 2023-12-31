package com.ofamosoron.caju_clone.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class BudgetCard(
    val label: String,
    val eventUiAttr: EventUiAttr,
    val budgetValue: String
)