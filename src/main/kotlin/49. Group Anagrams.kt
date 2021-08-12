/**
 * https://leetcode.com/problems/group-anagrams/
 * */

fun main() {
    val strs = arrayOf(
        "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"
    )
    println(groupAnagrams(strs))
}

//Runtime: 340 ms, faster than 63.82% of Kotlin online submissions for Group Anagrams.
//Memory Usage: 42.8 MB, less than 55.59% of Kotlin online submissions for Group Anagrams.
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return emptyList()
    return strs.groupBy { str ->
        str.toList().sorted()
    }.values.toList()
}