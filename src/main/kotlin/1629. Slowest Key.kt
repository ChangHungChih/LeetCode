/**
 * https://leetcode.com/problems/slowest-key/
 * */

fun main() {
    println(
        slowestKey(
            intArrayOf(9, 29, 49, 50), "cbcd"
        )
    )
}

fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
    var ans = Char.MIN_VALUE
    var maxDuration = Int.MIN_VALUE
    val keyArray = keysPressed.toCharArray()
    releaseTimes.foldIndexed(0) { index, before, after ->
        val duration = after - before
        if (duration == maxDuration) {
            ans = maxOf(ans, keyArray[index])
        }
        if (duration > maxDuration) {
            maxDuration = duration
            ans = keyArray[index]
        }
        after
    }
    return ans
}