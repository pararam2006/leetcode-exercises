package string

fun freqAlphabets(s: String): String {
    val charMap = mapOf(
        "1" to 'a',
        "2" to 'b',
        "3" to 'c',
        "4" to 'd',
        "5" to 'e',
        "6" to 'f',
        "7" to 'g',
        "8" to 'h',
        "9" to 'i',
        "10#" to 'j',
        "11#" to 'k',
        "12#" to 'l',
        "13#" to 'm',
        "14#" to 'n',
        "15#" to 'o',
        "16#" to 'p',
        "17#" to 'q',
        "18#" to 'r',
        "19#" to 's',
        "20#" to 't',
        "21#" to 'u',
        "22#" to 'v',
        "23#" to 'w',
        "24#" to 'x',
        "25#" to 'y',
        "26#" to 'z'
    )
    val res = StringBuilder()
    var i = 0
    while (i < s.length) {
        when{
            i+2 <= s.length - 1 && s[i+2] == '#' -> {
                res.append(charMap[s.substring(i, i+3)])
                i += 3
            }
            else -> {
                res.append(charMap[s[i].toString()])
                i++
            }
        }
    }
//    println(res.toString())
    return res.toString()
}

fun main() {
    freqAlphabets("10#11#12")
}