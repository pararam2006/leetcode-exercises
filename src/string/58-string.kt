fun lengthOfLastWord(s: String): Int {
    val wordsList: List<String> = s.split(regex = Regex("\\s+")).filter { it.isNotEmpty() }
    println(wordsList)
    val res = wordsList[wordsList.lastIndex].length
    return res
}

fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
}