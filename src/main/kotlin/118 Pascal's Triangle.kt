/**
 * https://leetcode.com/problems/pascals-triangle/
 * */

fun main() {
    println(generate(5).toString())
}

fun generate(numRows: Int): List<List<Int>> {
    val ans = mutableListOf(listOf(1))
    if (numRows == 1) return ans
    ans.add(listOf(1, 1))
    if (numRows == 2) return ans
    var row = 3
    while (row <= numRows) {
        val list = MutableList(row) { 1 }
        var index = 1
        while (index < row - 1) {
            list[index] = ans[row - 2][index - 1] + ans[row - 2][index]
            index++
        }
        ans.add(list)
        row++
    }
    return ans
}