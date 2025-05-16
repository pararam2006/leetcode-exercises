package string

fun finalValueAfterOperations(operations: Array<String>): Int {
    var res = 0
    for (operation in operations) {
        when(operation) {
            "--X", "X--" -> res--
            "++X", "X++" -> res++
        }
    }
//    println(res)
    return res
}

fun main() {
    finalValueAfterOperations(arrayOf("--X","X++","X++"))
}