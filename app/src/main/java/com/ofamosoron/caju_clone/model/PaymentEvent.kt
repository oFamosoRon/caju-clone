package com.ofamosoron.caju_clone.model

data class PaymentEvent(
    val price: String,
    val label: String,
    val time: String,
    val eventUiAttr: EventUiAttr
)