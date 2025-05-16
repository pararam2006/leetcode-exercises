package string

import kotlin.math.abs

fun scoreOfString(s: String): Int {
    var res = 0
    for (i in s.indices) {
        if (i < s.length - 1) res += abs(s[i].code - s[i+1].code)
    }
//    println(res)
    return res
}

fun main() {
    scoreOfString("hello")
}