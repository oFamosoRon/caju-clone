package com.ofamosoron.caju_clone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.lifecycle.ViewModel
import com.ofamosoron.caju_clone.model.BudgetCard
import com.ofamosoron.caju_clone.ui.theme.CultureCardColor
import com.ofamosoron.caju_clone.ui.theme.EducationCardColor
import com.ofamosoron.caju_clone.ui.theme.FoodCardColor
import com.ofamosoron.caju_clone.ui.theme.HealthCardColor
import com.ofamosoron.caju_clone.ui.theme.HomeOfficeCardColor
import com.ofamosoron.caju_clone.ui.theme.MealCardColor
import com.ofamosoron.caju_clone.ui.theme.MobilityCardColor
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val budgetCards = listOf(
        BudgetCard(
            label = "home office",
            icon = Icons.Outlined.Home,
            budgetValue = "10,00",
            color = HomeOfficeCardColor
        ),
        BudgetCard(
            label = "refeição",
            icon = Icons.Outlined.Face,
            budgetValue = "10,00",
            color = MealCardColor
        ),
        BudgetCard(
            label = "alimentação",
            icon = Icons.Outlined.ShoppingCart,
            budgetValue = "10,00",
            color = FoodCardColor
        ),
        BudgetCard(
            label = "mobilidade",
            icon = Icons.Default.Face,
            budgetValue = "10,00",
            color = MobilityCardColor
        ),
        BudgetCard(
            label = "cultura",
            icon = Icons.Default.Email,
            budgetValue = "10,00",
            color = CultureCardColor
        ),
        BudgetCard(
            label = "saúde",
            icon = Icons.Default.Email,
            budgetValue = "10,00",
            color = HealthCardColor
        ),
        BudgetCard(
            label = "educação",
            icon = Icons.Default.Email,
            budgetValue = "10,00",
            color = EducationCardColor
        )

    )

    private val _state = MutableStateFlow(State(budgetCards))
    val state = _state.asStateFlow()

    data class State(
        val budgetCards: List<BudgetCard> = listOf()
    )
}