package com.example.zadanie14

fun mainZagadki(): Int {

    val listSize:Int = getZagadkiLength(createZagadkiList())
    val num: Int = (0 until listSize).random()
    return num
}
fun createZagadkiList(): MutableList<String> {
    val zagadkiList: MutableList<String> = mutableListOf<String>(
        "Что принадлежит вам, но другие используют это чаще?",
        "Горело 5 электрических лампочек, три лампочки выключили. Сколько лампочек осталось?",
        "Каких камней нет ни в одном море?"
    )
    return zagadkiList
}
fun getZagadka(num:Int, zagadkiList:MutableList<String>):String{
    return zagadkiList[num]
}
fun getZagadkiLength(zagadkiList: MutableList<String>):Int{
    return zagadkiList.size
}
fun createOtvetList(): MutableList<String> {
    val otvetList: MutableList<String> = mutableListOf<String>("Имя", "Пять", "Сухих")
    return otvetList
}
fun getRightOtvet(num: Int,otvetList: MutableList<String>):String{
    val rightOtvet:String = otvetList[num]
    return rightOtvet
}
fun checkOtvet(otvet: String, rightOtvet:String): String {
    if (otvet == rightOtvet)
        return "Правильно"
    else   {
        return "Не правильно"
    }
}