package sorting

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var resArr = nums1

    //Слияние
    for (i in m ..< m + n) {
        resArr[i] = nums2[i - m]
    }

    //Сортировка
    resArr.sort()

//    for (elem in resArr) println(elem) //Вывод результата
}

fun main() {
    merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3)
}