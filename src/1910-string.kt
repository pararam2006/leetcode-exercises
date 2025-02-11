//todo: Вырезание из строки нужной подстроки готово, но нужно доделать до автоматического вырезания до конца
class Solution {
    fun removeOccurrences(s: String, part: String): String {
        var res = ""
        var substr = ""
        var cuttedSubst = ""
        var startSubstrForCutIndex = 0
        var endSubstrForCutIndex = 0
        for (symb in s) {
            substr += symb
            endSubstrForCutIndex++
            if (substr.length >= part.length && substr.substring(substr.length - part.length, substr.length) == part) {
                cuttedSubst = substr.substring(0, substr.length - part.length)
                res = s.replaceBefore(s[endSubstrForCutIndex + 1], cuttedSubst)
                println("cuttedSubst: $cuttedSubst, substr: $substr, s: $s, startSubstrForCutIndex: $startSubstrForCutIndex, endSubstrForCutIndex: $endSubstrForCutIndex, res: $res")
                
                //Сброс значений переменных 
                res = ""
                substr = ""
                cuttedSubst = ""
                startSubstrForCutIndex = 0
                endSubstrForCutIndex = 0
                return res
            }
        }
//        val hui = "daabcbaabcbc"
//        res = hui.replaceBefore(hui[6], "da")
//        println(res)

        return res
    }
}

fun main(){
    val solution = Solution()
    solution.removeOccurrences("daabcbaabcbc", "abc")
    solution.removeOccurrences("axxxxyyyyb", "xy")
}
//daabcbaabcbc
//daaabcbaabcbc