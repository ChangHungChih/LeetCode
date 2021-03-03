import java.util.ArrayList

/**
 * https://leetcode.com/problems/missing-number/
 * */

fun main() {
    val nums = intArrayOf(0)
    println(missingNumber(nums))
}

//Runtime: 196 ms, faster than 98.77% of Kotlin online submissions for Missing Number.
//Memory Usage: 36.8 MB, less than 92.64% of Kotlin online submissions for Missing Number.
fun missingNumber(nums: IntArray): Int {
    val len = nums.size
    val arr = IntArray(len)
    nums.forEach {
        if (it < len) {
            arr[it]++
        }
    }
    val indexOfZero = arr.indexOfFirst { it == 0 }
    return if (indexOfZero >= 0) {
        indexOfZero
    } else {
        len
    }
}