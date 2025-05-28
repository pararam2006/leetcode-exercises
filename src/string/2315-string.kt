package string

fun countAsterisks(s: String): Int {
    var count = 0
    var barClosed = true
    for (c in s) {
        when (c) {
            '*' -> if (barClosed) count++
            '|' -> barClosed = !barClosed
            else -> continue
        }
    }
    return count
}

fun main() {
    countAsterisks("l|*e*et|c**o|*de|")
}