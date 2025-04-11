package string

fun minimizedStringLength(s: String): Int {
    var charSet: MutableSet<Char> = mutableSetOf()

    for (i in s.indices) {
        if (charSet.contains(s[i])) {
            continue
        } else {
            charSet.add(s[i])
        }
    }

    var resStr = ""
    charSet.forEach { char ->
        resStr += char
    }

    val res = resStr.length

    println(resStr)
    println(res)

    return res
}

fun main() {
    minimizedStringLength("aaabc")
    minimizedStringLength("cbbd")
    minimizedStringLength("baadccab")
}