/**
 * https://leetcode.com/problems/two-sum/
 * */

fun main() {
    val arr = intArrayOf(
        2, 7, 11, 15
    )

    println(twoSum(arr, 9).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, i ->
        if (map.contains(target - i)){
            return intArrayOf(map[target - i]!!, index)
        }
        map[i] = index
    }
    return intArrayOf()
}