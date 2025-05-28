package string

fun firstPalindrome(words: Array<String>): String {
    var res = ""
    for(word in words) {
        if (word == word.reversed()) {
            res = word
            break
        }
    }
    return res
}

fun main(){
    firstPalindrome(arrayOf("abc","car","ada","racecar","cool"))
}