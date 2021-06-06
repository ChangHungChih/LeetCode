/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * */

fun main() {
    val arr = intArrayOf(
        100, 4, 200, 1, 3, 2
    )

    println(longestConsecutive(arr))
}

fun longestConsecutive(nums: IntArray): Int {
    var ans = 0
    val numSet = nums.toMutableSet()
    nums.forEach { num ->
        if (numSet.contains(num)) {
            numSet.remove(num)
            var len = 1
            var large = num + 1
            while (numSet.contains(large)){
                numSet.remove(large)
                large++
                len++
            }
            var small = num - 1
            while (numSet.contains(small)){
                numSet.remove(small)
                small--
                len++
            }
            ans = maxOf(ans, len)
        }
    }

    return ans
}