package other

fun main() {
    val str = "ababca"

    // Создаем двумерный ArrayList с двумя строками
    val arrayList = ArrayList<ArrayList<Any>>()

    // Инициализируем первую строку (для символов из str)
    val firstRow = ArrayList<Any>()
    for (char in str) {
        firstRow.add(char) // Добавляем сам символ
    }
    arrayList.add(firstRow)

    // Инициализируем вторую строку (для значений 0 или 1)
    val secondRow = ArrayList<Any>()
    for (i in str.indices) {
        when(str[i]){
            'a' -> secondRow.add(1)
            'b' -> secondRow.add(1)
            else -> secondRow.add(0)
        }
    }
    arrayList.add(secondRow) //Добавляем строку в двумерный массив

    // Вывод двумерного массива
    for (row in arrayList) {
        for (cell in row) {
            print("$cell \t")
        }
        println()
    }
}