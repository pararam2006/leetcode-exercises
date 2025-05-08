package sorting

fun majorityElement(nums: IntArray): Int {
    var numsMap = mutableMapOf<Int, Int>()
    for (i in 0..< nums.size) {
        if(numsMap.containsKey(nums[i])) {
//            numsMap.computeIfPresent(nums[i]) { key, value -> value + 1 }
            numsMap[nums[i]] = numsMap.getOrDefault(nums[i], 0) + 1
        } else {
            numsMap.put(nums[i], 1)
        }
    }
    val res = numsMap.maxBy { it.value }.key
    return res
}

fun main(){
    majorityElement(intArrayOf(3,2,3))
}
