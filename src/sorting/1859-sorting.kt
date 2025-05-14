package sorting

fun sortSentence(s: String): String {
    val strList = s.split(" ")
    val resList = MutableList(size = strList.size) { "" }
    for (i in strList.indices) {
        val index = strList[i].last().toString().toInt() - 1
        resList[index] = strList[i].substring(0, strList[i].length - 1)
    }

    var res = ""
    for (i in 0..< resList.size) {
        if (i == resList.size - 1){
            res += resList[i]
        } else {
            res += resList[i] + " "
        }
    }
    return res
}

fun main() {
    println(sortSentence("is2 sentence4 This1 a3"))
}