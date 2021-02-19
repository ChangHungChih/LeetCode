import java.util.*
import kotlin.math.abs

/**
 * https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
 * */

fun main() {
    val s = "))(("
    val s1 = "())()((("
    println(minRemoveToMakeValid(s))
    println(minRemoveToMakeValid(s1))
}
//Runtime: 340 ms, faster than 37.84% of Kotlin online submissions for Minimum Remove to Make Valid Parentheses.
//Memory Usage: 40 MB, less than 35.13% of Kotlin online submissions for Minimum Remove to Make Valid Parentheses.
fun minRemoveToMakeValid(s: String): String {
    val stack = Stack<Int>()
    fun pushIndexToStack(index: Int, c: Char) {
        if (c == '(') {
            stack.push(index + 1)
        } else {
            stack.push(-index - 1)
        }
    }
    s.forEachIndexed { index, c ->
        if (c.isLetter())
            return@forEachIndexed
        if (stack.isNotEmpty()) {
            val peekIndex = stack.peek()
            if ((c == ')' && peekIndex > 0)) {
                stack.pop()
            } else {
                pushIndexToStack(index, c)
            }
        } else {
            pushIndexToStack(index, c)
        }
    }
    val ans = s.toCharArray()
    while (stack.isNotEmpty()){
        ans[abs(stack.pop()) - 1] = '@'
    }

    return String(ans).replace("@", "")
}