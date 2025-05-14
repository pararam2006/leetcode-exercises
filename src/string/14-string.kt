package string

fun longestCommonPrefix(strs: Array<String>) : String {
    if (strs.isEmpty()) return ""

    val prefix = StringBuilder()
    for ((index, char) in strs[0].withIndex()) {
        if (strs.all {
                if (index >= it.length) return@all false
                it[index] == char
            }) {
            prefix.append(char)
        } else {
            break
        }
    }

    return prefix.toString()
}

//Не мое решение
//fun longestCommonPrefix(strs: Array<String>): String {
//    if (strs.isEmpty()) return ""
//
//    val prefix = StringBuilder()
//    for ((index, char) in strs[0].withIndex()) {
//        if (strs.all {
//                if (index >= it.length) return@all false
//                it[index] == char
//            }) {
//            prefix.append(char)
//        } else {
//            break
//        }
//    }
//
//    return prefix.toString()
//}

fun main() {
    longestCommonPrefix(arrayOf("ab","a"))
    longestCommonPrefix(arrayOf("flower","flower","flower","flower"))
}