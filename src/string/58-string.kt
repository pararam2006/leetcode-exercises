//Первое решение, такое себе, но коротко
//fun lengthOfLastWord(s: String): Int {
//    val wordsList: List<String> = s.split(regex = Regex("\\s+")).filter { it.isNotEmpty() }
////    println(wordsList)
//    val res = wordsList[wordsList.lastIndex].length
//    return res
//}

//Второе решение: длинно, но быстро
fun lengthOfLastWord(s: String): Int {
    var isLetterFounded = false
    var res = 0
    for (i in s.length - 1 downTo 0) {
        when{
            //Если символ - не пробел, а буква уже была найдена
            s[i] == ' ' && isLetterFounded -> {
                return res
            }

            //Если символ - пробел, а буква еще не найдена
            s[i] == ' ' && !isLetterFounded -> {
                continue
            }

            //Если символ - не пробел, а буква найдена
            s[i] != ' ' && isLetterFounded -> {
                res++
            }

            //Если символ - не пробел, а буква еще не найдена
            s[i] != ' ' && !isLetterFounded -> {
                isLetterFounded = true
                res++
            }

        }
    }

    return res
}

fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
}