package com.example.udp.app

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): List<CreditCard> {
        return creditCardService.getCreditCards()
    }
}