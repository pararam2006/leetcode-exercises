package string

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    val first = StringBuilder()
    val second = StringBuilder()
    for (word in word1) {
        first.append(word)
    }
    for (word in word2) {
        second.append(word)
    }
//    println(first)
//    println(second)
    if (first.toString() == second.toString()) return true else return false
}

fun main() {
    val res = arrayStringsAreEqual(word1 = arrayOf("ab", "c"), word2 = arrayOf("a", "bc")) //true
    println(res)
}