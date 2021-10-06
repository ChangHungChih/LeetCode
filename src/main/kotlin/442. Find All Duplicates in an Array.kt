/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * */

fun main() {
    println(
        findDuplicates(
            intArrayOf(
                4, 3, 2, 7, 8, 2, 3, 1
            )
        )
    )
}

fun findDuplicates(nums: IntArray): List<Int> {
    return nums.groupBy {
        it
    }.filter {
        it.value.size == 2
    }.map {
        it.key
    }
}

