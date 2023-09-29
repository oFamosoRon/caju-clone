package com.ofamosoron.caju_clone.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class BudgetCard(
    val label: String,
    val color: Color,
    val icon: ImageVector,
    val budgetValue: String
)