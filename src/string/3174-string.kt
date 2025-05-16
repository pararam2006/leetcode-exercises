package string

//Рекурсия
//fun clearDigits(s: String): String {
//    val res = StringBuilder(s)
//    for (i in 1 until res.length) {
//        if (res[i].isDigit() && res[i - 1].isLetter()) {
//            res.delete(i - 1, i + 1)
//            return clearDigits(res.toString()) // рекурсивно вызываем и возвращаем результат
//        }
//    }
//    return res.toString()
//}

//Цикл
fun clearDigits(s: String): String {
    val res = StringBuilder(s)
    var i = 0
    while (i < res.length) {
        if (res[i].isDigit()) {
            if (i > 0 && res[i - 1].isLetter()) {
                res.delete(i - 1, i + 1) // удаляем букву и цифру
                i = 0 // начинаем заново, так как строка изменилась
                continue
            }
        }
        i++
    }
//    println(res)
    return res.toString()
}


fun main() {
    clearDigits("abc")
    clearDigits("cb34")
}