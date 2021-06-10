/**
 * https://leetcode.com/problems/my-calendar-i/
 * */

fun main() {
    var obj = MyCalendar()
    println(obj.book(10, 20))
    println(obj.book(15, 25))
    println(obj.book(20, 30))
}

//from discuss
//Runtime: 332 ms, faster than 86.36% of Kotlin online submissions for My Calendar I.
//Memory Usage: 48.7 MB, less than 61.36% of Kotlin online submissions for My Calendar I.
class MyCalendar {
    private val calendar = mutableListOf<Pair<Int, Int>>()

    fun book(start: Int, end: Int): Boolean {
        val pair = Pair(start, end)
        calendar.forEach {
            if (maxOf(it.first, start) < minOf(it.second, end)) return false
        }
        calendar.add(pair)
        return true
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = MyCalendar()
 * var param_1 = obj.book(start,end)
 */