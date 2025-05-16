package string

fun truncateSentence(s: String, k: Int): String {
    var res = StringBuilder()
    var spacesCount = 0
    for (char in s) {
        when(char) {
            ' ' -> {
                if (spacesCount < (k - 1)) {
                    res.append(char)
                    spacesCount++
                } else {
                    return res.toString()
                }
            }
            else -> {
                res.append(char)
            }
        }
    }
    return res.toString()
}

fun main() {
    var res = truncateSentence("Hello how are you Contestant", 4)
    println(res)
}