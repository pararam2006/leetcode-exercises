package string

fun countSeniors(details: Array<String>): Int {
    var res = 0
    details.forEach { if (it.substring(11, 13).toInt() > 60) res++ }
    return res
}

fun main() {
    countSeniors(arrayOf("7868190130M7522","5303914400F9211","9273338290F4010"))
}