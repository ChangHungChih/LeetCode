/**
 * https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
 * */

fun main() {
    val s = "abpcplea"
    val d = listOf("ale", "apple", "monkey", "plea", "fsld", "jpthiudqzzeugzwwsngebdeai")
//    val s = "aewfafwafjlwajflwajflwafj"
//    val d = listOf("apple", "ewaf", "awefawfwaf", "awef", "awefe", "ewafeffewafewf")
//    //expect: "ewaf"
    println(findLongestWord(s, d))
}


//Runtime: 272 ms, faster than 71.43% of Kotlin online submissions for Longest Word in Dictionary through Deleting.
//Memory Usage: 41.1 MB, less than 28.57% of Kotlin online submissions for Longest Word in Dictionary through Deleting.
fun findLongestWord(s: String, d: List<String>): String {
    var ans = ""
    d.sorted().forEach {
        if (it.length > s.length || it.length <= ans.length) {
            return@forEach
        }
        var cIndex = -1
        it.forEach s@{ c ->
            cIndex = s.indexOf(c, startIndex = cIndex + 1)
            if (cIndex < 0) {
                return@forEach
            }
        }
        ans = it
    }
    return ans
}