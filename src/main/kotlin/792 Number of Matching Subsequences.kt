/**
 * https://leetcode.com/problems/number-of-matching-subsequences/
 * */

fun main() {
    val s = "rwpddkvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvjubjgloeofnpjqlkdsqvruvabjrikfwronbrdyyjnakstqjac"
    val words = arrayOf(
        "wpddkvbnn","lnagtva","kvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvju","rwpddkvbnnugln","gloeofnpjqlkdsqvruvabjrikfwronbrdyyj","vbgeinupkvgmgxeaaiuiyojmoqkahwvbpwugdainxciedbdkos","mspuhbykmmumtveoighlcgpcapzczomshiblnvhjzqjlfkpina","rgmliajkiknongrofpugfgajedxicdhxinzjakwnifvxwlokip","fhepktaipapyrbylskxddypwmuuxyoivcewzrdwwlrlhqwzikq","qatithxifaaiwyszlkgoljzkkweqkjjzvymedvclfxwcezqebx"
    )

    //expect 5
    println(numMatchingSubseq(s, words))
}

//Runtime: 1060 ms, faster than 33.33% of Kotlin online submissions for Number of Matching Subsequences.
//Memory Usage: 38.1 MB, less than 70.00% of Kotlin online submissions for Number of Matching Subsequences.
fun numMatchingSubseq(s: String, words: Array<String>): Int {
    var ans = 0
    words.forEach {
        if (isSubSeq(s, it)) ans++
    }

    return ans
}

fun isSubSeq(s: String, word: String): Boolean {
    var startIndex = Int.MIN_VALUE
    word.forEach { char ->
        s.indexOf(char = char, startIndex = startIndex).let { index ->
            if (index >= 0) startIndex = index + 1 else return false
        }
    }
    return true
}