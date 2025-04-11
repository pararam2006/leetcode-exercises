package string

fun strStr(haystack: String, needle: String): Int {
    var res = -1
    var i = 0
    var j = i + needle.length
    haystack.forEach {
        if (j > haystack.length) {
            return res
        }
        val substr = haystack.substring(i, j) //Получение подстроки
        if (substr == needle) {
            println("$substr подошел, вхождение = $i")
            res = i
            return res
        }
        else {
            println("$substr не подошел")
            i++
            j = i + needle.length
        }
    }
    return res
}