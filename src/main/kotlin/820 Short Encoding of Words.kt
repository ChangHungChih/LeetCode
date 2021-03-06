/**
 * https://leetcode.com/problems/short-encoding-of-words/
 * */

fun main() {
    println(
        minimumLengthEncoding(
            arrayOf(
                "time", "me", "bell"
            )
        )
    )
}

//from discuss
//Runtime: 600 ms, faster than 100.00% of Kotlin online submissions for Short Encoding of Words.
//Memory Usage: 55.6 MB, less than 100.00% of Kotlin online submissions for Short Encoding of Words.
fun minimumLengthEncoding(words: Array<String>): Int {
    val wordSet = mutableSetOf(*words)
    words.forEach {
        var index = 1
        while (index < it.length) {
            wordSet.remove(it.substring(index++))
        }
    }

    return wordSet.sumBy { it.length } + wordSet.size
}