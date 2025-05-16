package string

fun replaceDigits(s: String): String {
    val res = StringBuilder()
    for (i in s.indices) {
        if (s[i].isDigit()) {
            res.append((s[i - 1] + (s[i] - '0')))
        }else{
            res.append(s[i])
        }
    }
    return res.toString()
}

fun main() {
//    replaceDigits("a1c1e1")
    replaceDigits("a1b2c3d4e")
}