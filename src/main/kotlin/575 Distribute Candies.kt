/**
 * https://leetcode.com/problems/distribute-candies/
 * */

fun main() {
    val candyType = intArrayOf(1, 1, 2, 2, 3, 3)
    println(distributeCandies(candyType))
}

//Runtime: 432 ms, faster than 100.00% of Kotlin online submissions for Distribute Candies.
//Memory Usage: 44.4 MB, less than 50.00% of Kotlin online submissions for Distribute Candies.
fun distributeCandies(candyType: IntArray): Int {
    return minOf(candyType.toSet().size, candyType.size / 2)
}