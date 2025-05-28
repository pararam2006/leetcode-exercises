package string

//Первое решение(сравнение с помощью .reversed() и перебора циклом)
//fun maximumNumberOfStringPairs(words: Array<String>): Int {
//    var res = 0
//    for (i in words.indices) {
//        for (j in i+1 until words.size) {
//            if (words[i] == words[j].reversed()) res++
//        }
//    }
//    return res
//}

//Второе решение (String(charArrayOf(words[j][1], words[j][0]))) вместо .reversed() - по рантайму лучше
fun maximumNumberOfStringPairs(words: Array<String>): Int {
    var res = 0
    for (i in words.indices) {
        for (j in i+1 until words.size) {
            val reversedElem = String(charArrayOf(words[j][1], words[j][0]))
            if (words[i] == reversedElem) res++
        }
    }
//    println(res)
    return res
}

fun main() {
    maximumNumberOfStringPairs(arrayOf("aa", "ab"))
    maximumNumberOfStringPairs(arrayOf("ab", "ba", "cc"))
}