package needToStudy

/**
 * https://leetcode.com/problems/count-of-smaller-numbers-after-self/
 * */


fun main() {
    val nums = intArrayOf(
        5, 2, 6, 1
    )

    println(countSmaller(nums))
}

//Time Limit Exceeded
fun countSmaller(nums: IntArray): List<Int> {
    return nums.mapIndexed { index, i ->
        nums.drop(index + 1).filter {
            it < i
        }.size
    }
}

//Time Limit Exceeded
fun `countSmaller fail`(nums: IntArray): List<Int> {
    val ans = mutableListOf<Int>()
    nums.forEachIndexed { indexOfElement, num ->
        val count = nums.filterIndexed { index, i ->
            index > indexOfElement && i < num
        }.size
        ans.add(count)
    }
    return ans
}