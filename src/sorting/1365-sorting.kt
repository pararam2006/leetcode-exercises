package sorting

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val result = IntArray(size = nums.size)
    for (i in nums.indices) {
        var count = 0
        for (num in nums) {
            if (nums[i] > num) {
                count++
            }
        }
        result[i] = count
    }
    return result
}

fun main() {
    smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3))
}