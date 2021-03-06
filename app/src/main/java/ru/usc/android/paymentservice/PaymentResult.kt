package ru.usc.android.paymentservice

sealed class PaymentResult

data class TransactionComplete(val transactionId: String): PaymentResult()

data class TransactionError(val errorCode: Int, val errorMsg: String): PaymentResult()