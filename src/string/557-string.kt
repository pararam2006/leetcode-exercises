package string

////Первое решение
//fun reverseWords(s: String): String {
//    val splitted = s.split(" ")
//    val res = StringBuilder()
//    for(word in splitted) {
//        res.append(word.reversed() + " ")
//    }
//    res.deleteAt(res.length - 1)
////    println(res)
//    return res.toString()
//}

fun reverseWords(s: String): String {
    val res = StringBuilder()
    val tmp = StringBuilder()
    for(char in s) {
        if (char == ' ') {
            res.append(tmp.reverse())
            res.append(" ")
            tmp.delete(0, tmp.length)
        } else {
            tmp.append(char)
        }
    }
    res.append(tmp.reverse())
//    println(res)
    return res.toString()
}

fun main() {
    reverseWords("Let's take LeetCode contest")
}