package other

//Тут класс с методами для проверки строк с помощью регулярных выражений
class MyRegexFunctions {
    fun isStartsWithUppercase(input: String): Boolean {
        return input.matches(Regex("^[A-Z].*$"))
    }

    fun isStartsWithLowercase(input: String): Boolean {
        return input.matches(Regex("^[a-z].*$"))
    }

    fun isValidEmail(input: String): Boolean {
        return input.matches(Regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com\$"))
    }

    fun isValidIPv4Adress(input: String): Boolean {
        return input.matches(Regex("^((0|[1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}(0|[1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"))
    }
}