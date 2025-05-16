package string

fun toLowerCase(s: String): String {
    val res = StringBuilder()
    for(elem in s) {
        if (elem.code in 65..90) {
            res.append(elem + 32)
        } else {
            res.append(elem)
        }
    }
//    println(res)
    return res.toString()
}

fun main() {
    toLowerCase("LOVELY")
    toLowerCase("Hello")
}