package string

fun isBalanced(num: String): Boolean {
    var evenSumm = 0
    var oddSum = 0
    num.forEachIndexed { index, char ->
        run {
            if (index % 2 == 0) {
                //you can use .digitToInt() instead of .toString().toInt()
                evenSumm += char.digitToInt()
            } else {
                oddSum += char.digitToInt()
            }
        }
    }
    return evenSumm == oddSum
}

fun main() {
    isBalanced("1234") //false
    isBalanced("24123") //true
}