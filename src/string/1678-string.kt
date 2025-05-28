package string

fun interpret(command: String): String {
    var tmp = command.replace(Regex("""\(\)"""), "o")
    val res = StringBuilder()
    for (char in tmp){
        if (char == '(' || char == ')') continue else res.append(char)
    }
//    println(res)
    return res.toString()
}

fun main() {
    interpret("G()(al)")
}