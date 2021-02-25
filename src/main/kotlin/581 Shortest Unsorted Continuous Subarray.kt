
/**
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 * */

fun main() {
    val intArray = intArrayOf(2, 6, 4, 8, 10, 9, 15)
    println(findUnsortedSubarray(intArray))
}

//Runtime: 284 ms, faster than 66.67% of Kotlin online submissions for Shortest Unsorted Continuous Subarray.
//Memory Usage: 41.5 MB, less than 19.05% of Kotlin online submissions for Shortest Unsorted Continuous Subarray.
fun findUnsortedSubarray(nums: IntArray): Int {
    var isBegin = false
    var beginIndex = 0
    var endIndex = -1
    nums.copyOf().apply { sort() }.forEachIndexed { index, i ->
        if (nums[index] != i){
            if (isBegin){
                endIndex = index
            }else{
                beginIndex = index
                isBegin = true
            }
        }
    }

    return ++endIndex - beginIndex
}