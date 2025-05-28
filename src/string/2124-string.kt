package string

fun checkString(s: String): Boolean {
    return !s.contains("ba")
}

fun main() {
    checkString("aaabbb")
}