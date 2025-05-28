package string

fun mergeAlternately(word1: String, word2: String): String {
    val result = StringBuilder()
    var i = 0
    var j = 0
    while (i < word1.length || j < word2.length) {
        if (i < word1.length) {
            result.append(word1[i])
            i++
        }
        if (j < word2.length) {
            result.append(word2[j])
            j++
        }
    }
//    println(result.toString())
    return result.toString()
}

fun main() {
    mergeAlternately("abc", "pqr")
}