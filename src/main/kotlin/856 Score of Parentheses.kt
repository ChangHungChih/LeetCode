import java.util.*

/**
 *https://leetcode.com/problems/score-of-parentheses/
 * */

fun main() {
    val s = "(()(()))"
    println(scoreOfParentheses(s))
}

//from discuss
//Runtime: 136 ms
//Memory Usage: 33.2 MB
fun scoreOfParentheses(S: String): Int {
    var ans = 0
    val stack = Stack<Int>()
    S.forEach {
        ans = if (it == '(') {
            stack.push(ans)
            0
        } else {
            stack.pop() + maxOf(ans * 2, 1)
        }
    }

    return ans
}