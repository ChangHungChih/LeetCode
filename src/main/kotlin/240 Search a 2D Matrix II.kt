/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 * */

fun main() {
    val target = 38
    val matrix = arrayOf(
        intArrayOf(1, 4, 7, 11, 15),
        intArrayOf(2, 5, 8, 12, 19),
        intArrayOf(3, 6, 9, 16, 22),
        intArrayOf(10, 13, 14, 17, 24),
        intArrayOf(18, 21, 23, 26, 30),
    )
    println(searchMatrix(matrix, target))
}

//Runtime: 260 ms, faster than 39.29% of Kotlin online submissions for Search a 2D Matrix II.
//Memory Usage: 46.2 MB, less than 50.00% of Kotlin online submissions for Search a 2D Matrix II.
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    matrix.forEach {
        if (it.binarySearch(target) >= 0)
            return true
    }
    return false
}