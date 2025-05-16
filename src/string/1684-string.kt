package string

fun countConsistentStrings(allowed: String, words: Array<String>): Int {
    var res = 0
    val allowedChars = allowed.toSet()
    forWord@ for (word in words) {
        forChar@ for(char in word) {
            when (char) {
                in allowedChars -> continue@forChar
                !in allowedChars -> continue@forWord
            }

        }
        res++
    }
//    println(res)
    return res
}

fun main() {
    countConsistentStrings(allowed = "ab", words = arrayOf("ad","bd","aaab","baa","badab")) //2
    countConsistentStrings(allowed = "abc", words = arrayOf("a","b","c","ab","ac","bc","abc")) //7
}