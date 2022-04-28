package com.example.zadanie14

fun mainAlphabet(str:String):String{


    return counter(str).toString()
}

fun getNum(char: Char): Int {
    val alphabetList: HashMap<Int, Char> = hashMapOf<Int, Char>()
    var i: Int = 1

    for (ch in 'а'..'е') {
        alphabetList.put(i, ch)
        i++
    }
    alphabetList.put(7, 'ё')
    i++
    for (ch in 'ж'..'я') {
        alphabetList.put(i, ch)
        i++
    }



    var number: Int = 0
    for (x in 1..alphabetList.size){
        if (char == alphabetList.get(x)){
            number = x
            break}
        else{
            number = 0
        }
    }

    return number
}

fun counter(str: String): Int {
    var count: Int = 0
    for (element in str) {
        count += getNum(element)
    }
    return count
}