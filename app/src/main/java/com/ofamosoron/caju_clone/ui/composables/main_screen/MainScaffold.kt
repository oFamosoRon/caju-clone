package com.ofamosoron.caju_clone.ui.composables.main_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ofamosoron.caju_clone.MainViewModel
import com.ofamosoron.caju_clone.model.BudgetCard
import com.ofamosoron.caju_clone.model.PaymentEvent
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CCScaffold(
    budgetCardsList: List<BudgetCard>,
    totalBudget: String,
    flexibleBudget: String,
    nextDepositDate: String,
    paymentHistory: List<PaymentEvent>
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CCTopBar() },
        bottomBar = { CCBottomBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            CCBudgetCardsList(budgetCardsList = budgetCardsList)
            Spacer(modifier = Modifier.padding(16.dp))
            CCExpandableInfo(
                totalBudget = totalBudget,
                flexibleBudget = flexibleBudget,
                nextDepositDate = nextDepositDate
            )
            CCActions()
            Spacer(modifier = Modifier.padding(16.dp))
            CCPaymentHistory(paymentHistory)
        }
    }
}

@Preview
@Composable
fun MainScaffoldPreview() {
    Caju_cloneTheme {
        val viewModel = MainViewModel()
        val state = viewModel.state.collectAsState()
        CCScaffold(
            budgetCardsList = state.value.budgetCards,
            totalBudget = state.value.totalBudget,
            flexibleBudget = state.value.flexibleBudget,
            nextDepositDate = state.value.nextAvailableDeposit,
            paymentHistory = state.value.paymentHistory
        )
    }
}