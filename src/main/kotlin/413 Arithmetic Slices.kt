/**
 * https://leetcode.com/problems/arithmetic-slices/
 * */

fun main() {
    val A = intArrayOf(1, 2, 3, 4)
    println(numberOfArithmeticSlices(A))
}

//Runtime: 156 ms, faster than 90.00% of Kotlin online submissions for Arithmetic Slices.
//Memory Usage: 35.9 MB, less than 40.00% of Kotlin online submissions for Arithmetic Slices.
fun numberOfArithmeticSlices(A: IntArray): Int {
    val arrayLen = A.size
    var ans = 0
    var slice = 0

    for (i in (2 until arrayLen)) {
        if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
            slice++
            ans += slice
        } else {
            slice = 0
        }
    }

    return ans
}