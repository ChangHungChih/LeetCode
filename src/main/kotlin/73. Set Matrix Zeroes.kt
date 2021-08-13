/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 * */

fun main() {
    val matrix = arrayOf(
        intArrayOf(0, 1, 2, 0),
        intArrayOf(3, 4, 5, 2),
        intArrayOf(1, 3, 1, 5),
    )
    setZeroes(matrix)
    println(matrix.contentDeepToString())
}

//Runtime: 540 ms, faster than 5.56% of Kotlin online submissions for Set Matrix Zeroes.
//Memory Usage: 59.7 MB, less than 5.56% of Kotlin online submissions for Set Matrix Zeroes.
fun setZeroes(matrix: Array<IntArray>) {
    val zeroIndex = mutableListOf<IntArray>()
    matrix.forEachIndexed { i, array ->
        array.forEachIndexed { j, num ->
            if (num == 0) {
                zeroIndex.add(intArrayOf(i, j))
            }
        }
    }
    zeroIndex.forEach {
        var x = 0
        while (x < matrix.size) {
            matrix[x][it[1]] = 0
            x++
        }
        var y = 0
        while (y < matrix[0].size) {
            matrix[it[0]][y] = 0
            y++
        }
    }
}