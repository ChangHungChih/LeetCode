/**
 * https://leetcode.com/problems/add-strings/
 * */

fun main() {
    println(addStrings("99", "9"))
}

//Runtime: 192 ms, faster than 55.36% of Kotlin online submissions for Add Strings.
//Memory Usage: 35.9 MB, less than 52.68% of Kotlin online submissions for Add Strings.
fun addStrings(num1: String, num2: String): String {
    var backIndex = 1
    var overTen = false
    var ans = ""
    val len1 = num1.length
    val len2 = num2.length
    while (len1 - backIndex >= 0 && len2 - backIndex >= 0) {
        val n1 = num1.elementAt(len1 - backIndex).toString().toInt()
        val n2 = num2.elementAt(len2 - backIndex).toString().toInt()
        val sum = n1 + n2 + (if (overTen) 1 else 0)
        overTen = sum > 9
        ans = "${if (overTen) sum % 10 else sum}$ans"
        backIndex++
    }
    if (len1 - backIndex >= 0) {
        while (len1 - backIndex >= 0) {
            val sum = num1.elementAt(len1 - backIndex).toString().toInt() + (if (overTen) 1 else 0)
            overTen = sum > 9
            ans = "${if (overTen) sum % 10 else sum}$ans"
            backIndex++
        }
    } else if (len2 - backIndex >= 0) {
        while (len2 - backIndex >= 0) {
            val sum = num2.elementAt(len2 - backIndex).toString().toInt() + (if (overTen) 1 else 0)
            overTen = sum > 9
            ans = "${if (overTen) sum % 10 else sum}$ans"
            backIndex++
        }
    }
    if (overTen){
        ans = "1$ans"
    }
    return ans
}