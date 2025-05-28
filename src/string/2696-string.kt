package string

fun minLength(s: String): Int {
    var res = StringBuilder(s)
    while(res.contains("AB") || res.contains("CD")) {
        res = StringBuilder(res.replace(Regex("AB"), ""))
        res = StringBuilder(res.replace(Regex("CD"), ""))
    }
//    println(res.toString())
    return res.length
}

fun main() {
    minLength("ABFCACDB")
}