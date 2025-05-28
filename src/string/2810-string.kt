package string

fun finalString(s: String): String {
    var res = StringBuilder()
    for (char in s) {
        if (char == 'i') res = res.reverse() else res.append(char)
    }
    return res.toString()
}

fun main() {
    finalString("string")
}