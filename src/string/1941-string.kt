package string

fun areOccurrencesEqual(s: String): Boolean {
    val map = mutableMapOf<Char, Int>()
    s.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }
    var tmp = map.values.first()
    return map.values.all { it == tmp }
}

fun main() {
//    areOccurrencesEqual("abacbc") //true
//    areOccurrencesEqual("aaabb") //false
    areOccurrencesEqual("tveixwaeoezcf") //false
}