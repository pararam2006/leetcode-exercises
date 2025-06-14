package string

fun countPoints(rings: String): Int {
    val roads = List<MutableSet<Char>>(10) { mutableSetOf() }
    var res = 0
    val chunked = rings.chunked(2)
    for (chunk in chunked) {
        roads[chunk[1].digitToInt()].add(chunk[0])
    }
    roads.forEach { if (it.size == 3) res++}
    return res
}

fun main() {
    countPoints("B0B6G0R6R0R6G9")
}