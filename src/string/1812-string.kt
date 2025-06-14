package string

import kotlin.math.abs

fun squareIsWhite(coordinates: String): Boolean {
    return abs(coordinates[0].code - 96 - coordinates[1].digitToInt()) % 2 != 0
}

fun main() {
    squareIsWhite("a1")
}