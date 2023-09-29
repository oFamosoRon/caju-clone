package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.ui.theme.AccentBlue
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

@Composable
fun BudgetSettingsButton() {
    Column(
        modifier = Modifier
            .width(95.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(
                border = BorderStroke(1.dp, color = AccentBlue),
                shape = RoundedCornerShape(16.dp)
            )
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(vertical = 18.dp))
        Icon(
            Icons.Outlined.Settings,
            contentDescription = "Reorder icon",
            tint = AccentBlue,
            modifier = Modifier
                .clip(CircleShape)
                .border(
                    border = BorderStroke(1.dp, color = AccentBlue),
                    shape = CircleShape
                )
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.padding(vertical = 18.dp))
        Text(text = "ORDENAR", style = MaterialTheme.typography.labelSmall, color = AccentBlue)
    }
}

@Preview
@Composable
fun BudgetSettingsButtonPreview() {
    Caju_cloneTheme {
        BudgetSettingsButton()
    }
}