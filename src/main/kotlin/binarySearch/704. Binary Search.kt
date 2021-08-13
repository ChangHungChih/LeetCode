package binarySearch

/**
 * https://leetcode.com/problems/binary-search/
 * */

fun main() {
    val nums = intArrayOf(
        -1, 0, 3, 5, 9, 12
    )
    println(search(nums, 9))
}

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = (left + right) / 2
        if (nums[mid] < target) {
            left = mid + 1
        } else if (nums[mid] > target) {
            right = mid - 1
        } else if (nums[mid] == target) {
            return mid
        }
    }
    return -1
}