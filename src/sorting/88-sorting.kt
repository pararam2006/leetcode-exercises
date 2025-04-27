package sorting

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var resArr = nums1

    //Слияние
    for (i in m ..< m + n) {
        resArr[i] = nums2[i - m]
    }

    //Сортировка
    fun bubbleSort(arr: IntArray): IntArray {
        for (i in 0..< arr.size - 1) {
            for (j in 0..< arr.size - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
        return arr
    }

    resArr = bubbleSort(resArr)

    for (elem in resArr) println(elem) //Вывод результата
}

fun main() {
    merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3)
}