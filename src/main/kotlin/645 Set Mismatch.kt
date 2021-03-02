/**
 * https://leetcode.com/problems/set-mismatch/
 * */

fun main() {
    val nums = intArrayOf(2, 2)
    findErrorNums(nums).forEach {
        println(it)
    }
}

//Runtime: 236 ms, faster than 94.12% of Kotlin online submissions for Set Mismatch.
//Memory Usage: 38.6 MB, less than 82.35% of Kotlin online submissions for Set Mismatch.
fun findErrorNums(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    var duplicateNum = -1
    var lostNum = -1
    nums.forEach {
        arr[it - 1]++
    }
    arr.forEachIndexed { index, i ->
        if (i > 1) {
            duplicateNum = index + 1
        }
        if (i == 0) {
            lostNum = index + 1
        }
    }
    return intArrayOf(duplicateNum, lostNum)
}