package com.example.zadanie14

fun mainMagicBall(): String {

    var num:Int = (0 until 7).random()

    val answersList: MutableList<String> = mutableListOf<String>(
        "Дa","Нет", "Скорее всего да", "Скорее всего нет","Возможно",
        "Имеются перспективы","Вопрос задан неверно")
    return answersList[num]
}