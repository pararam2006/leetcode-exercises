package string

fun repeatedSubstringPattern(s: String): Boolean {
    for (i in 1.. s.length / 2) {
        //Если длина строки не делится на длину подстроки нацело, то пропускаем
        if (s.length % i != 0) continue
        val substr = s.substring(0, i)
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