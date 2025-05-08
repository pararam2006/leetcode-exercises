package other

//ТУТ БУДЕТ ТРЕНИРОВКА В НАПИСАНИИ РЕГУЛЯРНЫХ ВЫРАЖЕНИЙ
fun main() {
    println(MyRegexFunctions().isStartsWithUppercase("Hui")) //true
    println(MyRegexFunctions().isStartsWithUppercase("pizda")) //false
    println(MyRegexFunctions().isValidEmail("john.smith@sub.domain.com")) //true
}