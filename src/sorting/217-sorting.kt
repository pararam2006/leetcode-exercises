package sorting

fun containsDuplicate(nums: IntArray): Boolean {
    var numsSet = mutableSetOf<Int>()
    var res = false
    for (i in 0..< nums.size) {
        if (numsSet.contains(nums[i])) {
            return true
        } else {
            numsSet.add(nums[i])
        }
    }

    return false
}

fun main() {
    containsDuplicate(intArrayOf(1,2,3,1))
}