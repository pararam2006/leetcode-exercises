package string

fun reverseString(s: CharArray): Unit {
    var i = 0
    var j = s.size - 1
    //Можно было поставить
//     while(i<j) {
    while (i < (s.size - 1) / 2 || j > (s.size - 1) / 2) {
        val tmp = s[i]
        s[i] = s[j]
        s[j] = tmp
        i++
        j--
    }
//    println(s)
}

fun main() {
    reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))
}