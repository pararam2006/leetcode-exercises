package string

fun numOfStrings(patterns: Array<String>, word: String): Int {
    var res = 0
    patterns.forEach { if (word.contains(it)) res++ }
//    println(res)
    return res
}

fun main() {
    numOfStrings(arrayOf("a","abc","bc","d"), "abc")
}