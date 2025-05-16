package string

//Мое решение
fun checkIfPangram(sentence: String): Boolean {
    val set = mutableSetOf<Char>()
    for (char in sentence) {
        set.add(char)
    }

    return set.size >= 26
}

//Эталонное по рантайму решение с использованием ASCII кода символа
//fun checkIfPangram(sentence: String): Boolean {
//    if(sentence.length < 26) return false
//
//    val arr = BooleanArray(26)
//    for(i in sentence) {
//        arr[i.code - 'a'.code] = true
//    }
//    for(i in arr){
//        if(!i) return false
//    }
//    return true
//}

fun main() {
    val res = checkIfPangram("thequickbrownfoxjumpsoverthelazydog")
    println(res)
}