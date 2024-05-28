package com.example.udp.app

import retrofit2.http.GET

interface CreditCardService {

    @GET("credit_cards")
    suspend fun getCreditCards(): List<CreditCard>

}