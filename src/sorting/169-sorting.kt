package sorting

fun majorityElement(nums: IntArray): Int {
    val numsMap = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        if(numsMap.containsKey(nums[i])) {
            numsMap[nums[i]] = numsMap.getOrDefault(nums[i], 0) + 1
        } else {
            numsMap[nums[i]] = 1
        }
    }
    val res = numsMap.maxBy { it.value }.key
    return res
}

fun main(){
    majorityElement(intArrayOf(3,2,3))
}
