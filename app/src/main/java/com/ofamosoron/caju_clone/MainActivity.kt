package com.ofamosoron.caju_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import com.ofamosoron.caju_clone.ui.composables.main_screen.CCScaffold
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Caju_cloneTheme {
                val viewModel: MainViewModel by viewModels()
                val state = viewModel.state.collectAsState()
                CCScaffold(
                    budgetCardsList = state.value.budgetCards,
                    totalBudget = state.value.totalBudget,
                    flexibleBudget = state.value.flexibleBudget,
                    nextDepositDate = state.value.nextAvailableDeposit
                )
            }
        }
    }
}
