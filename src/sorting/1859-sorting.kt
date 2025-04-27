package sorting

fun sortSentence(s: String): String {
    var strList = s.split(" ")
    var resList = MutableList(size = strList.size) { "" }
    for (i in 0..< strList.size) {
        val index = strList[i].last().toString().toInt() - 1
        resList[index] = strList[i].substring(0, strList[i].length - 1)
    }

    var res = ""
    for (i in 0..< resList.size) {
        if (i == resList.size - 1) res += resList[i] else res += resList[i] + " "
    }
    return res
}

fun main() {
    println(sortSentence("is2 sentence4 This1 a3"))
}