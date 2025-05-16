package string

fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val res: MutableList<Int> = mutableListOf()
    firstFor@ for (i in words.indices) {
        secondFor@ for (char in words[i]) {
            if (char == x) res.add(i) else continue
            break@secondFor
        }
    }
//    println(res)
    return res
}

fun main() {
    findWordsContaining(arrayOf("leet", "code"), 'e')
}