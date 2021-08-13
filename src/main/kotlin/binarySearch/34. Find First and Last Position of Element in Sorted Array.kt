package binarySearch

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * */

fun main() {
    val nums = intArrayOf(
        5, 7, 7, 8, 8, 10
    )
    println(searchRange(nums, 8).contentToString())
}

//Runtime: 329 ms, faster than 5.03% of Kotlin online submissions for Find First and Last Position of Element in Sorted Array.
//Memory Usage: 43.5 MB, less than 5.53% of Kotlin online submissions for Find First and Last Position of Element in Sorted Array.
fun searchRange(nums: IntArray, target: Int): IntArray {
    if (nums.isEmpty()) return intArrayOf(-1, -1)
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = (left + right) / 2
        if (nums[mid] < target) {
            left = mid + 1
        } else if (nums[mid] > target) {
            right = mid - 1
        } else if (nums[mid] == target) {
            right = mid - 1
        }
    }
    if (left >= nums.size || nums[left] != target) return intArrayOf(-1, -1)
    right = left
    while (right < nums.size && nums[right] == target) {
        right++
    }

    return intArrayOf(left, right - 1)
}