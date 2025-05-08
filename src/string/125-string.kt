package string

fun isPalindrome(s: String): Boolean {
    var tmp = s.replace(regex = Regex("[^a-zA-Z0-9]"), "").uppercase()
//    println(tmp)
    if (tmp.reversed() == tmp) return true else return false
}

fun main() {
  println(isPalindrome("0P"))
}