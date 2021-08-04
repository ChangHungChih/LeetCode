package needToStudy.backtrack

/**
 * https://leetcode.com/problems/subsets-ii/
 * */

fun main() {
    val arr = intArrayOf(
        1, 2, 3
    )
    println(subsetsWithDup(arr))
}

fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    nums.sort()
    val ans = mutableListOf<List<Int>>()
    backtrack(ans, mutableListOf(), nums, 0)
    return ans
}

fun backtrack(ans: MutableList<List<Int>>, currentList: MutableList<Int>, nums: IntArray, index: Int) {
    ans.add(currentList.toList())
    for (i in index until nums.size) {
        if (i > index && nums[i] == nums[i - 1]) continue
        currentList.add(nums[i])
        backtrack(ans, currentList, nums, i + 1)
        currentList.removeLast()
//        currentList.removeAt(currentList.size - 1)
    }
}