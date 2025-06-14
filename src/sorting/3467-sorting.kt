package sorting

fun transformArray(nums: IntArray): IntArray {
    nums.forEachIndexed { index, value ->  nums[index] = if (value % 2 == 0) 0 else 1 }
    nums.sort()
    return nums
}

fun main() {
    transformArray(intArrayOf(4, 3, 2, 1))
}