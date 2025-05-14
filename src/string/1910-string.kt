package string

fun removeOccurrences(s: String, part: String): String {
    var res = s
    while (res != res.replaceFirst(part, "")) {
        res = res.replaceFirst(part, "")
//        println(res)
    }
    return res
}

fun main() {
    removeOccurrences("daabcbaabcbc", "abc")
}