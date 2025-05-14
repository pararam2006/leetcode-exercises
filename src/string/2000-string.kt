package string

fun reversePrefix(word: String, ch: Char): String {
    val res = word.substring(0, word.indexOf(ch) + 1).reversed() + word.substring(word.indexOf(ch) + 1, word.length)
//    println(res)
    return res
}

fun main() {
    reversePrefix("abcdefd", 'd')
    reversePrefix("абвгдейка", 'д')
}