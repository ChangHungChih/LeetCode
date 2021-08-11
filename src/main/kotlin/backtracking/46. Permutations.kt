package backtracking

fun main() {
    val nums = intArrayOf(
        1, 2, 3
    )

    println(permute(nums))
}

//Runtime: 204 ms, faster than 75.50% of Kotlin online submissions for Permutations.
//Memory Usage: 37.1 MB, less than 85.50% of Kotlin online submissions for Permutations.
fun permute(nums: IntArray): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    fun backtracking(path: MutableList<Int>) {
        if (path.size == nums.size) {
            ans.add(path)
        } else {
            nums.forEach {
                if (path.contains(it)) return@forEach
                path.add(it)
                backtracking(path.toMutableList())
                path.remove(it)
            }
        }
    }
    backtracking(mutableListOf())
    return ans
}
