/**
 * https://leetcode.com/problems/shifting-letters/
 * */

fun main() {
    val s = "bad"
    val shifts = intArrayOf(
        10, 20, 30
    )
    println(shiftingLetters(s, shifts))
}

fun shiftingLetters(s: String, shifts: IntArray): String {
    val totalShifts = IntArray(shifts.size)
    shifts.foldRightIndexed(0) { index, i, acc ->
        val shift = (i + acc) % 26
        totalShifts[index] = shift
        shift
    }
    val ans = StringBuilder()
    s.forEachIndexed { index, c ->
        var ch = c + totalShifts[index]
        if (ch > 'z') {
            ch -= 26
        }
        ans.append(ch)
    }
    return ans.toString()
}