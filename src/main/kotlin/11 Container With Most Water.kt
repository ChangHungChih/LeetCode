
/**
 * https://leetcode.com/problems/container-with-most-water/
 * */

fun main() {
    val height = intArrayOf(1,8,6,2,5,4,8,3,7)
    println(maxArea(height = height))
}


//Runtime: 756 ms, faster than 20.13% of Kotlin online submissions for Container With Most Water.
//Memory Usage: 37.5 MB, less than 47.52% of Kotlin online submissions for Container With Most Water.
fun maxArea(height: IntArray): Int {
    var ans = 0
    val len = height.size
    for (i in (0..len - 2)) {
        val left = height[i]
        for (j in (len - 1 downTo 1)) {
            if (i == j){
                break
            }
            val right = height[j]
            val eachHeight = Integer.min(left, right)
            ans = maxOf(ans, eachHeight * (j - i))
        }
    }

    return ans
}