/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * */

fun main() {
    val s = "aaaaaaaa"
    println(removeDuplicates(s))
}

//Runtime: 468 ms, faster than 19.23% of Kotlin online submissions for Remove All Adjacent Duplicates In String.
//Memory Usage: 37.2 MB, less than 36.54% of Kotlin online submissions for Remove All Adjacent Duplicates In String.
fun removeDuplicates(s: String): String {
    var ans = s
    var duplicateIndex = findDuplicate(ans)
    while (duplicateIndex > 0) {
        ans = ans.removeRange(duplicateIndex - 1, duplicateIndex + 1)
        duplicateIndex = findDuplicate(ans)
    }

    return ans
}

fun findDuplicate(s: String): Int {
    if (s.isEmpty()) return -1
    s.reduceIndexed { index, acc, c ->
        if (acc == c) return index else c
    }
    return -1
}