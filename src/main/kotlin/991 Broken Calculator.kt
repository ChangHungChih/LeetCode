/**
 * https://leetcode.com/problems/broken-calculator/
 * */


fun main() {
    println(brokenCalc(3, 10))
}


//from discuss
//Runtime: 132 ms, faster than 100.00% of Kotlin online submissions for Broken Calculator.
//Memory Usage: 32.9 MB, less than 50.00% of Kotlin online submissions for Broken Calculator.
fun brokenCalc(X: Int, Y: Int): Int {
    var ans = 0
    var target = Y
    while (target > X) {
        if (target % 2 == 0) {
            target /= 2
        } else {
            target++
        }
        ans++
    }

    return ans + X - target
}
