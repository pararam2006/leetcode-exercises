package sorting

fun targetIndices(nums: IntArray, target: Int): List<Int> {
    val sortedArr = nums.sorted()
    val res = sortedArr.mapIndexedNotNull { index, value ->  if(value == target) index else null}
    return res
}

fun main() {
    targetIndices(intArrayOf(1,2,5,2,3), 2)
}