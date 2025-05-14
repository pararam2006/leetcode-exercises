package string

//Первое решение
//fun isPalindrome(s: String): Boolean {
//    var tmp = s.replace(regex = Regex("[^a-zA-Z0-9]"), "").uppercase()
////    println(tmp)
//    if (tmp.reversed() == tmp) return true else return false
//}

fun isPalindrome(s: String): Boolean {
    val tmp = StringBuilder()
    for (char in s) {
        if (char.isLetterOrDigit()) tmp.append(char.lowercaseChar())
    }
//    println(tmp)
    val reversed = tmp.reversed().toString()
    return tmp.toString() == reversed
}

fun main() {
  println(isPalindrome("0P"))
}