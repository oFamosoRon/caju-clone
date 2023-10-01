package com.ofamosoron.caju_clone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.lifecycle.ViewModel
import com.ofamosoron.caju_clone.model.BudgetCard
import com.ofamosoron.caju_clone.model.EventUiAttr
import com.ofamosoron.caju_clone.model.PaymentEvent
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
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.Home,
                color = HomeOfficeCardColor
            )
        ),
        BudgetCard(
            label = "refeição",
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.Face,
                color = MealCardColor
            )
        ),
        BudgetCard(
            label = "alimentação",
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.ShoppingCart,
                color = FoodCardColor
            )
        ),
        BudgetCard(
            label = "mobilidade",
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Default.Face,
                color = MobilityCardColor,
            )
        ),
        BudgetCard(
            label = "cultura",
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Default.Email,
                color = CultureCardColor,
            )
        ),
        BudgetCard(
            label = "saúde",
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Default.Email,
                color = HealthCardColor,
            )
        ),
        BudgetCard(
            label = "educação",
            budgetValue = "10,00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Default.Email,
                color = EducationCardColor,
            )
        )

    )

    private val paymentHistory = listOf(
        PaymentEvent(
            price = "10,10",
            label = "padaria luzitana",
            time = "06/10/1994 - 08:00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.ShoppingCart,
                color = FoodCardColor
            )
        ),
        PaymentEvent(
            price = "10,10",
            label = "bahamas",
            time = "06/10/1994 - 08:00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.Face,
                color = MealCardColor
            )
        ),
        PaymentEvent(
            price = "10,10",
            label = "agua",
            time = "06/10/1994 - 08:00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.Home,
                color = HomeOfficeCardColor
            )
        ),
        PaymentEvent(
            price = "10,10",
            label = "padaria luzitana",
            time = "06/10/1994 - 08:00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.ShoppingCart,
                color = FoodCardColor
            )
        ),
        PaymentEvent(
            price = "10,10",
            label = "bahamas",
            time = "06/10/1994 - 08:00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.Face,
                color = MealCardColor
            )
        ),
        PaymentEvent(
            price = "10,10",
            label = "agua",
            time = "06/10/1994 - 08:00",
            eventUiAttr = EventUiAttr(
                icon = Icons.Outlined.Home,
                color = HomeOfficeCardColor
            )
        )
    )

    private val _state = MutableStateFlow(
        State(
            totalBudget = "100,00",
            budgetCards = budgetCards,
            flexibleBudget = "50",
            nextAvailableDeposit = "06/10/1994",
            paymentHistory = paymentHistory
        )
    )
    val state = _state.asStateFlow()

    data class State(
        val totalBudget: String = "",
        val flexibleBudget: String = "",
        val nextAvailableDeposit: String = "",
        val budgetCards: List<BudgetCard> = listOf(),
        val paymentHistory: List<PaymentEvent> = listOf()
    )
}