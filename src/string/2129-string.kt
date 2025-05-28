package string

fun capitalizeTitle(title: String): String {
    val res = StringBuilder()
    val words = title.split(" ")
    for (word in words) {
        for (i in word.indices) {
            if (i == 0 && word.length > 2) {
                res.append(word[i].uppercaseChar())
            } else {
                res.append(word[i].lowercaseChar())
            }
        }
        res.append(" ")
    }
    res.deleteAt(res.length - 1)
//    println(res.toString())
    return res.toString()
}

fun main() {
    capitalizeTitle("capiTalIze tHe titLe")
    capitalizeTitle("First leTTeR of EACH Word")
    capitalizeTitle("i lOve leetcode")
}