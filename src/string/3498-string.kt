package string

//Решение через Map
//fun reverseDegree(s: String): Int {
//    val map: Map<Char, Int> = mapOf('a' to 26, 'b' to 25, 'c' to 24, 'd' to 23, 'e' to 22, 'f' to 21, 'g' to 20, 'h' to 19, 'i' to 18, 'j' to 17, 'k' to 16, 'l' to 15, 'm' to 14, 'n' to 13, 'o' to 12, 'p' to 11, 'q' to 10, 'r' to 9, 's' to 8, 't' to 7, 'u' to 6, 'v' to 5, 'w' to 4, 'x' to 3, 'y' to 2, 'z' to 1)
//    var res = 0
//    for (i in s.indices) {
//        res += map[s[i]]!! * (i+1)
//    }
////    println("res: $res")
//    return res
//}

//Решение через вычисление обратного кода символа арифметикой
fun reverseDegree(s: String): Int {
    var target = 0
    for (i in s.indices) {
        target += (i + 1) * (97 + 26 - s[i].code)
    }
    return target
}


fun main() {
    reverseDegree(s = "abc")
}