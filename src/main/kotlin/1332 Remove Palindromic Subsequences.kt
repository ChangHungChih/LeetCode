/**
 * https://leetcode.com/problems/remove-palindromic-subsequences/
 * */
//not a good problem

fun main() {
    println(removePalindromeSub("ababa"))
    println(removePalindromeSub("abb"))
    println(removePalindromeSub("baabb"))
    println(removePalindromeSub(""))
}

//from discuss
//Runtime: 140 ms, faster than 100.00% of Kotlin online submissions for Remove Palindromic Subsequences.
//Memory Usage: 35.2 MB, less than 50.00% of Kotlin online submissions for Remove Palindromic Subsequences.
fun removePalindromeSub(s: String): Int = when {
    s.isEmpty() -> 0
    s == s.reversed() -> 1
    else -> 2
}