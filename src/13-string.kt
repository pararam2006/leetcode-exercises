class RomanNum {
    val romanValues = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var res = 0
        for (i in s.indices) {
            val char = s[i]
            if (char !in romanValues) throw IllegalArgumentException("Неправильная римская цифра")

            val currentValue = romanValues[char]!!
            if (i + 1 < s.length && currentValue < romanValues[s[i + 1]]!!) {
                res -= currentValue // Если текущее число меньше следующего, вычитаем его значение
            } else {
                res += currentValue // Иначе добавляем его значение
            }
        }

        return res
    }
}

fun main(){
    val solution = RomanNum()
    println(solution.romanToInt("III")) //3
    println(solution.romanToInt("IX")) //9
    println(solution.romanToInt("LVIII")) //58
    println(solution.romanToInt("MCMXCIV")) //1994
}
