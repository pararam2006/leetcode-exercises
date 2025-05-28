package string

fun kthDistinct(arr: Array<String>, k: Int): String {
    val map = mutableMapOf<String, Int>()
    for (elem in arr) {
//        if (map.contains(elem)) {
//            map[elem] = map.getValue(elem) + 1
//        } else {
//            map[elem] = 1
//        }

        //Блок в for можно заменить на это:
         map[elem] = map.getOrDefault(elem, 0) + 1
    }
    val filtered = map.filter { it.value == 1 }
    val res: String
    if (filtered.size <= k - 1) res = "" else res = filtered.keys.toTypedArray()[k-1]
//    println(res)
    return res
}

fun main() {
//    kthDistinct(
//        arrayOf("d", "b", "c", "b", "c", "a"),
//        k = 2
//    )
    println()
    kthDistinct(
        arrayOf("a", "a"),
        k = 1
    )
}