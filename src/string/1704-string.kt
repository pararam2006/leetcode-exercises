package string

fun halvesAreAlike(s: String): Boolean {
    val a = s.substring(0, s.length / 2)
    val b = s.substring(s.length / 2, s.length)
    var countA = 0
    var countB = 0
    a.forEach {
        when(it) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> countA++
        }
    }
    b.forEach {
        when(it) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> countB++
        }
    }
    return countA == countB
}

fun main() {
    halvesAreAlike("book")
}