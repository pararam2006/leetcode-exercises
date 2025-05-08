package string

fun prefixCount(words: Array<String>, pref: String): Int {
    var res = 0
    for (i in words.indices) {
        if (words[i].startsWith(pref)) res++ else continue
    }

    return res
}

fun main() {
    prefixCount(arrayOf("pay","attention","practice","attend"), pref = "at")
}