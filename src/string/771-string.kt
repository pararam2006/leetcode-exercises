package string

fun numJewelsInStones(jewels: String, stones: String): Int {
    var res = 0
    for (char in stones) {
        for (i in jewels.indices) {
            if (jewels[i] == char)  {
                res++
            }
        }
    }
//    println(res)
    return res
}

fun main() {
    numJewelsInStones("aA", "aAAbbbb")
}