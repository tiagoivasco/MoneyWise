package com.ivasco.moneywise.data.model

data class Expense(
    val id: Int = 0,
    val name: String,
    val amount: Double,
    val category: String,
    val date: String
)