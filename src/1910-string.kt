class Solution {
    fun removeOccurrences(s: String, part: String): String {
        var res = s
        while (res != res.replaceFirst(part, "")) {
            res = res.replaceFirst(part, "")
            println(res)
        }
        return res
    }
}

fun main(){
    val solution = Solution()
    solution.removeOccurrences("daabcbaabcbc", "abc")
    solution.removeOccurrences("axxxxyyyyb", "xy")
}