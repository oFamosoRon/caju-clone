package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

@Composable
fun CCExpandableInfo(
    totalBudget: String,
    flexibleBudget: String,
    nextDepositDate: String
) {
    var isCollapsed by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Top,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Total em benefícios",
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "R$ $totalBudget",
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold
            )

        }

        Column(
            modifier = Modifier.animateContentSize()
        ) {
            if (!isCollapsed) {
                Spacer(modifier = Modifier.padding(6.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Valor flexivel",
                            style = MaterialTheme.typography.labelMedium,
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Icon(imageVector = Icons.Outlined.Info, contentDescription = "info")
                    }
                    Text(
                        text = "R$ $flexibleBudget",
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
                Spacer(modifier = Modifier.padding(6.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Próximo beneício",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = nextDepositDate,
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Divider(
                thickness = 2.dp,
                color = Color.LightGray,
                modifier = Modifier.weight(weight = 2F)
            )
            IconButton(onClick = { isCollapsed = !isCollapsed }) {
                if (isCollapsed) {
                    Icon(
                        Icons.Outlined.KeyboardArrowDown,
                        contentDescription = "expand collapse button",
                        modifier = Modifier
                            .weight(weight = 1F)
                            .size(30.dp)
                    )
                } else {
                    Icon(
                        Icons.Outlined.KeyboardArrowUp,
                        contentDescription = "expand collapse button",
                        modifier = Modifier
                            .weight(weight = 1F)
                            .size(30.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun CCExpandableInfoPreview() {
    Caju_cloneTheme {
        CCExpandableInfo(
            totalBudget = "1000",
            flexibleBudget = "50",
            nextDepositDate = "06/10/2023"
        )
    }
}