package string

fun minimumChairs(s: String): Int {
    var persons = 0
    var chairs = 0
    s.forEach {
        when(it) {
            'E' -> {
                if (persons == chairs) chairs++
                persons++
            }
            'L' -> {
                persons--
            }
        }
    }
    return chairs
}

fun main() {
    minimumChairs("EEEEEEE") //7
    minimumChairs("ELELEEL") //2
}