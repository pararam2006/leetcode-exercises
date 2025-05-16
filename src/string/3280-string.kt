package string

/*
Input: date = "2080-02-29"
Output: "100000100000-10-11101"
*/

//Первое решение
fun convertDateToBinary(date: String): String {
    val splitted = date.split(Regex("-"))
    val binaryParts = splitted.map {it.toInt().toString(2)} //В двоичное представление
    val res = binaryParts.joinToString("-")
    return res
}

//Дрочево рантайма
//fun convertDateToBinary(date: String): String {
//    val year = date.substring(0,4).toInt().toString(2)
//    val month = date.substring(5,7).toInt().toString(2)
//    val day = date.substring(8,10).toInt().toString(2)
//
//    return "$year-$month-$day"
//}

fun main() {
    convertDateToBinary("2080-02-29")
}