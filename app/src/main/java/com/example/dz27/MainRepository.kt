package com.example.dz27

class MainRepository constructor(private val retrofitService: RetrofitService) {
    suspend fun getAllCurrencies() = retrofitService.getAllCurrencies()
}