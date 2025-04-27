package sorting

fun maxProductDifference(nums: IntArray): Int {
    val firstMax = nums.max()
    var arrToSecondMax = nums.toMutableList()
    arrToSecondMax.remove(firstMax)
    arrToSecondMax.toIntArray()
    val secondMax = arrToSecondMax.max()

    val firstMin = nums.min()
    val arrToSecondMin = nums.toMutableList()
    arrToSecondMin.remove(firstMin)
    arrToSecondMin.toIntArray()
    val secondMin = arrToSecondMin.min()

    return (firstMax * secondMax) - (firstMin * secondMin)
}

fun main(){
    println(maxProductDifference(intArrayOf(5,6,2,7,4)))
}