fun main() {
//    var string = StringBuilder("aabbbcccc")
//    string.append("hui")
//
//    println(string)
//    val res = string
//        .groupingBy { it.toString() }.eachCount()
//    println(res)
    val string: StringBuilder = StringBuilder("abc")
    for (i in 0..< string.length) {
        for (j in 1..< string.length) {
            println("i: ${string.get(i)}, j: ${string.get(j)}")
            println("i: $i, j: $j")
        }
    }
}