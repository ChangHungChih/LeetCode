package backtracking

/**
 * https://leetcode.com/problems/combinations/
 * */

fun main() {
    println(combine(4, 2))
}

//Runtime: 448 ms, faster than 25.00% of Kotlin online submissions for Combinations.
//Memory Usage: 43.1 MB, less than 45.83% of Kotlin online submissions for Combinations.
fun combine(n: Int, k: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    fun backtracking(path: MutableList<Int>, num: Int) {
        if (path.size == k) {
            ans.add(path)
        } else {
            (num..n).forEach {
                if (path.contains(it)) return@forEach
                path.add(it)
                backtracking(path.toMutableList(), it + 1)
                path.remove(it)
            }
        }
    }
    backtracking(mutableListOf(), 1)
    return ans
}