package string

fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val map = mutableMapOf<String, Int>()
    words.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
        // println(map[it])
    }
    return map.entries
        .sortedWith(
            compareByDescending<Map.Entry<String, Int>> {it.value}
                .thenBy {it.key}
        )
        .take(k)
        .map {it.key}
}