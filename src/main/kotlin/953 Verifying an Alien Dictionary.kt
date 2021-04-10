/**
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * */

fun main() {
    val words = arrayOf("xmnxovqyg", "abgvz")
    val order = "itygnmsaefvkpuqozlbdcxjwrh"

    println(isAlienSorted(words, order))
}

fun translate(word: String, order: String): String =
    word.map { c ->
        "abcdefghijklmnopqrstuvwxyz"[order.indexOf(c)]
    }.joinToString("")

//from discussion
//Runtime: 224 ms, faster than 9.56% of Kotlin online submissions for Verifying an Alien Dictionary.
//Memory Usage: 38.2 MB, less than 5.88% of Kotlin online submissions for Verifying an Alien Dictionary.
fun isAlienSorted(words: Array<String>, order: String): Boolean =
    words.map { word ->
        translate(word, order)
    }.toTypedArray().let {
        it.contentEquals(it.sortedArray())
    }

//try to compare with the number, but overflow
//fun isAlienSorted(words: Array<String>, order: String): Boolean {
//    var maxLen = 0
//    words.forEach {
//        maxLen = maxOf(maxLen, it.length)
//    }
//    val valueList = mutableListOf<Int>()
//    words.forEach {
//        var valueOfWord = 0.0
//        it.forEachIndexed { index, c ->
//            val indexValue = order.indexOf(c) + 1
//            valueOfWord += indexValue * 10.0.pow((maxLen - index).toDouble())
//        }
//        valueList.add(valueOfWord.toInt())
//    }
//
//    var temp = -1
//    valueList.forEach {
//        if (temp > it) return false
//        temp = it
//    }
//
//    return true
//}