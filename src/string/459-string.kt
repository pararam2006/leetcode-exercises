package string

fun repeatedSubstringPattern(s: String): Boolean {
    println("Выполнение функции для $s")
    for (i in 1.. s.length / 2) {
        val substr = s.substring(0, i)
//        println("substr = $substr")
//        println("removedPrefix: ${s.removePrefix(substr)}")
        if (substr.repeat(s.length / substr.length) == s) {
            return true
        }
    }
    
    return false
}

fun main() {
    println(repeatedSubstringPattern("abab"))
    println(repeatedSubstringPattern("abcabcabcabc"))
}