package string

fun maxFreqSum(s: String): Int {
    val vowels = hashMapOf<String, Int>(
        "a" to 0,
        "e" to 0,
        "i" to 0,
        "o" to 0,
        "u" to 0
    )

    val consonants = hashMapOf<String, Int>()

    //Перебор строки
    for (char in s) {
        when(char.toString()) {
            in vowels -> {
                vowels[char.toString()] = vowels.get(char.toString())!! + 1
            }
            else -> {
                if (consonants.contains(char.toString())) {
                    consonants[char.toString()] = consonants.get(char.toString())!! + 1
                }
                else {
                    consonants[char.toString()] = 1
                }
            }
        }
    }

    //Подсчет максимального
    var maxVowels = 0
    vowels.values.forEach { if (it > maxVowels) maxVowels = it }
    var maxConsonants = 0
    consonants.values.forEach { if (it > maxConsonants) maxConsonants = it }
    return maxVowels+maxConsonants
}

fun main() {
    maxFreqSum("og")
}