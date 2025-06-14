package sorting

fun countPairs(nums: List<Int>, target: Int): Int {
    var result = 0
    for (i in nums.indices) {
        for (j in i+1 until nums.size) {
            if (nums[i] + nums[j] < target) result++
        }
    }
    return result
}

fun main() {
    countPairs(listOf(-1,1,2,3,1), 2) //3
}