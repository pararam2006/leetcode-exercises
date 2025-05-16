package string

//РАЗЪЕБ 100% ПО ПАМЯТИ И РАНТАЙМУ, ЮХУ!
fun isAcronym(words: List<String>, s: String): Boolean {
    val res = StringBuilder()
    for (i in words.indices) {
        res.append(words[i][0])
    }
//    println(res)
    return res.toString() == s
}

fun main() {
    isAcronym(listOf("alice","bob","charlie"), "abc")
}