package string

fun judgeCircle(moves: String): Boolean {
    var x = 0
    var y = 0
    moves.forEach {
        when(it) {
            'U' -> y++
            'D' -> y--
            'R' -> x++
            'L' -> x--
        }
    }
    return x == 0 && y == 0
}

fun main() {
    judgeCircle("UD") //true
    judgeCircle("LL") //false
}