package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.model.PaymentEvent

@Composable
fun CCPaymentHistory(paymentHistory: List<PaymentEvent>) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 22.dp)
    ) {
        Text(
            text = "últimas transações".uppercase(),
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(8.dp))
        for (i in 0..1) {
            CCPaymentHistoryItem(
                label = paymentHistory[i].label,
                eventTime = paymentHistory[i].time,
                eventPrice = paymentHistory[i].price,
                eventUiAttr = paymentHistory[i].eventUiAttr
            )
            Spacer(modifier = Modifier.padding(8.dp))
        }
    }
}