package string

import java.util.*

fun countKeyChanges(s: String): Int {
    var res = 0
    val lowercased = s.lowercase()
    var i = 0
    while (i < lowercased.length - 1) {
        if (lowercased[i+1] == lowercased[i]) {
            i++
            continue
        } else {
            res++
            i++
        }
    }
    return res
}

fun main() {
    countKeyChanges("aAbBcC")
}