package string

//Первое решение
//fun restoreString(s: String, indices: IntArray): String {
//    val res = StringBuilder("")
//    //Создание строки с пробелами
//    for (i in s.indices) {
//        res.append(" ")
//    }
//
//    //Заполнение строки с пробелами индексами
//    for (i in s.indices) {
//        res[indices[i]] = s[i]
//    }
//    println(res)
//    return res.toString()
//}

//Решение с CharArray (100% beats runtime)
fun restoreString(s: String, indices: IntArray): String {
    val res = CharArray(s.length)
    for (i in s.indices) {
        res[indices[i]] = s[i]
    }
//    println(res)
    return String(res)
}

fun main() {
    restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3))
}