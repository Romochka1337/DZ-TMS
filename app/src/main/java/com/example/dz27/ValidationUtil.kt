package com.example.dz27

object ValidationUtil {

    fun validateCurrency(currency: Currency) : Boolean {
        if (currency.Cur_Name.isNotEmpty() && currency.Cur_OfficialRate.isNotEmpty()) {
            return true
        }
        return false
    }
}