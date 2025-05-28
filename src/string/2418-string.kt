package string

fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    var list: MutableList<Pair<String, Int>> = mutableListOf()
    var i = 0
    while (i < names.size) {
        list.add(Pair(names[i], heights[i]))
        i++
    }
    
    //Сортировка в убывающем порядке
    list = list.sortedByDescending { it.second }.toMutableList()
    var res = Array<String>(list.size) {""}
    for (i in list.indices) {
        res[i] = list[i].first
    }
    //Вывод
    return res
}

fun main() {
    sortPeople(arrayOf("Mary","John","Emma"), intArrayOf(180,165,170))
    println()
    sortPeople(arrayOf("Alice","Bob","Bob"), intArrayOf(155,185,150))
}