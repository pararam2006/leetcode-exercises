package string

fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
    var counter = 0 //Для создания массива
    val matrix = Array<Array<Int>>(size = n){ Array(size = n) {counter++} }
    var i = 0
    var j = 0

    for (command in commands) {
        when(command) {
            "RIGHT" -> j++
            "LEFT" -> j--
            "UP" -> i--
            "DOWN" -> i++
        }
    }

    return matrix[i][j]
}

fun main() {
    finalPositionOfSnake(3, listOf("DOWN","RIGHT", "UP"))
}