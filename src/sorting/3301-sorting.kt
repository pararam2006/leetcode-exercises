package sorting

fun maximumTotalSum(maximumHeight: IntArray): Long {
    val sortedHeight = maximumHeight.sortedDescending().toMutableList() //Сортировка по убыванию
//    println(sortedHeight)

    if (sortedHeight[0] < maximumHeight.size) return -1 //Проверка на количество элементов

    //Преобразование массива
    for (i in 1..< sortedHeight.size) {
        if (sortedHeight[i] >= sortedHeight[i - 1]) {
            if (sortedHeight[i] - 1 > 0) {
                sortedHeight[i] = sortedHeight[i - 1] - 1 //Изменение элемента в List
                if (sortedHeight[i] <= 0) return -1
            }
            else if (sortedHeight[i] - 1 <= 0) {
                return -1
            }
        } else {
            continue
        }
    }
//    println(sortedHeight)
    
    return sortedHeight.sumOf {it.toLong()}
}

fun main() {
    println(maximumTotalSum(intArrayOf(2,3,4,3)))
}