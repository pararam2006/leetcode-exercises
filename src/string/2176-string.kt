package string

//Мое решение(12ms без принта)
fun minimizedStringLength(s: String): Int {
    val charSet: MutableSet<Char> = mutableSetOf()
    var res = 0
    for (i in s.indices) {
        if (charSet.contains(s[i])) {
            continue
        } else {
            charSet.add(s[i])
            res++
        }
    }

//    println(res)
    return res
}

//Крутое решение (4ms)
// fun minimizedStringLength(s: String): Int {
//    val table = BooleanArray('z'.code + 1)  // Создаем массив для отметки уникальных символов
//    for (c in s) {
//        table[c.code] = true  // Помечаем символ как присутствующий
//    }
//    return table.count { it }  // Считаем количество уникальных символов
//}

fun main() {
    minimizedStringLength("aaabc")
    minimizedStringLength("cbbd")
    minimizedStringLength("baadccab")
}