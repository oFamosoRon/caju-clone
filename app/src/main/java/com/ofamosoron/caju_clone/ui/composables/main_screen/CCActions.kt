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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.ui.theme.AccentBlue
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

@Composable
fun CCActions() {
    Column(
        modifier = Modifier.padding(horizontal = 22.dp)
    ) {
        Text(
            text = "ações".uppercase(),
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                Icon(
                    imageVector = Icons.Outlined.Refresh,
                    contentDescription = "transfer budget",
                    tint = Color.White,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(AccentBlue)
                        .padding(4.dp)
                        .size(16.dp)
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "Transferir saldo entre benefícios", style = MaterialTheme.typography.labelMedium)
            }
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowRight,
                contentDescription = "icon",
                tint = AccentBlue
            )
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Divider(thickness = 0.5.dp, color = Color.LightGray)
        Spacer(modifier = Modifier.padding(4.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                Icon(
                    imageVector = Icons.Outlined.DateRange,
                    contentDescription = "pay bull",
                    tint = Color.White,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(AccentBlue)
                        .padding(4.dp)
                        .size(16.dp)
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "Pagar boleto", style = MaterialTheme.typography.labelMedium)
            }
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowRight,
                contentDescription = "icon",
                tint = AccentBlue
            )
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Divider(thickness = 0.5.dp, color = Color.LightGray)
        Spacer(modifier = Modifier.padding(4.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun CCActionsPreview() {
    Caju_cloneTheme {
        CCActions()
    }
}