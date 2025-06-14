package string

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val set = mutableSetOf<String>()
    val morseMap = mapOf(
        'a' to ".-",
        'b' to "-...",
        'c' to "-.-.",
        'd' to "-..",
        'e' to ".",
        'f' to "..-.",
        'g' to "--.",
        'h' to "....",
        'i' to "..",
        'j' to ".---",
        'k' to "-.-",
        'l' to ".-..",
        'm' to "--",
        'n' to "-.",
        'o' to "---",
        'p' to ".--.",
        'q' to "--.-",
        'r' to ".-.",
        's' to "...",
        't' to "-",
        'u' to "..-",
        'v' to "...-",
        'w' to ".--",
        'x' to "-..-",
        'y' to "-.--",
        'z' to "--.."
    )
    for(word in words) {
        val tmp = StringBuilder()
        for (char in word) {
            tmp.append(morseMap[char])
        }
        set.add(tmp.toString())
    }
    return set.size
}

fun main() {
    uniqueMorseRepresentations(arrayOf("gin","zen","gig","msg")) //2
    uniqueMorseRepresentations(arrayOf("a")) //1
}