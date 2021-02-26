import java.util.*

/**
 * https://leetcode.com/problems/validate-stack-sequences/
 * */

fun main() {
//    val pushed = intArrayOf(1, 2, 3, 4, 5)
//    val popped = intArrayOf(4, 5, 3, 2, 1)

    val pushed = intArrayOf(2, 1, 0)
    val popped = intArrayOf(1, 2, 0)
    println(validateStackSequences(pushed, popped))
}

//from discuss
//Runtime: 188 ms, faster than 90.00% of Kotlin online submissions for Validate Stack Sequences.
//Memory Usage: 39 MB, less than 30.00% of Kotlin online submissions for Validate Stack Sequences.
fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val stack = Stack<Int>()
    var popIndex = 0
    pushed.forEach {
        stack.push(it)
        while (stack.isNotEmpty() && popped[popIndex] == stack.peek()) {
            stack.pop()
            popIndex++
        }
    }

    return stack.isEmpty()
}


//fail
//fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
//    val stack = Stack<Int>()
//    val len = pushed.size
//    var pushIndex = 0
//    var popIndex = 0
//    for (i in popped) {
//        while (pushIndex < len && pushed[pushIndex] != i) {
//            stack.push(pushed[pushIndex])
//            pushIndex++
//        }
//        if (pushed[--pushIndex] == i) {
//            popIndex++
//        }
//        pushIndex++
//        if (pushIndex >= len) {
//            break
//        }
//    }
//    while (stack.isNotEmpty()) {
//        if (popped[popIndex++] != stack.pop()) {
//            return false
//        }
//    }
//    return true
//}