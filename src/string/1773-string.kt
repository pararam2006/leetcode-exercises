package string

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var res = 0
    for (list in items) {
        when(ruleKey){
            "color" -> if (list[1] == ruleValue) res++
            "name" -> if (list[2] == ruleValue) res++
            "type" -> if (list[0] == ruleValue) res++
        }
    }
//    println(res)
    return res
}

fun main() {
    countMatches(
        items = listOf(
            listOf("phone","blue","pixel"),
            listOf("computer","silver","lenovo"),
            listOf("phone","gold","iphone")
        ),
        ruleKey = "color",
        ruleValue = "silver"
    )
}