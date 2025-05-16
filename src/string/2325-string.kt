package string

fun decodeMessage(key: String, message: String): String {
    val lettersMap = mutableMapOf<Char, Char>()
    var i = 0
    var ch = 'a'

    //Перебор ключа
    for (char in key) {
        if (char == ' ') continue
        if (!lettersMap.contains(char)) lettersMap.put(char, ch) else continue
        ch++
    }

    val res = StringBuilder()

    //Перебор зашифрованного сообщения
    for (char in message) {
        if (char == ' ') {
            res.append(' ')
        } else {
            res.append(lettersMap[char])
        }
    }

//    println(lettersMap.entries)
//    println(res)
    return res.toString()
}

fun main() {
    decodeMessage(key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv")
}