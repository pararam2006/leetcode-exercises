package string

//Через Regex
//fun defangIPaddr(address: String): String {
//    var res = address
//    res = res.replace(Regex("\\."), "[.]")
//    return res
//}

//Через цикл
fun defangIPaddr(address: String): String {
    val splitted = address.split(".")
    val res = StringBuilder()
    for (i in splitted.indices) {
        res.append("${splitted[i]}[.]")
    }
    res.delete(res.length - 3, res.length)
    return res.toString()
}

fun main() {
    defangIPaddr("1.1.1.1")
}