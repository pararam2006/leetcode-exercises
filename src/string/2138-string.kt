package string

fun divideString(s: String, k: Int, fill: Char): Array<String> {
    val possibleDivides: Int
    if (s.length % k != 0) possibleDivides = (s.length / k) + 1 else possibleDivides = s.length / k
    var stringBuiders = Array(possibleDivides) { StringBuilder() }
    var currIndex = 0
    for (i in stringBuiders.indices) {
        for (j in currIndex until s.length) {
            //Если stringBuiders[i].length < k, то добавляем s[j]
            if (stringBuiders[i].length < k) {
                stringBuiders[i].append(s[j])
                currIndex++
            }
        }
    }
    
    //Проверяем последний элемент
    if (stringBuiders.last().length < k) {
        repeat(
            times = k - stringBuiders.last().length,
            action = { stringBuiders.last().append(fill) },
        )
    }

//    stringBuiders.forEach { println(it.toString()) }
    val res = stringBuiders.map { it.toString() }.toTypedArray()
    return res
}

fun main() {
    divideString("abcdefghi", 3, 'x')
    divideString("abcdefghij", 3, 'x')
}