package needToStudy.dp

/**
 * https://leetcode.com/problems/delete-operation-for-two-strings/
 * */

fun main() {
    val word1 = "sea"
    val word2 = "eat"
    println(minDistance(word1, word2))
}

fun minDistance(word1: String, word2: String): Int {
    val len = lcs(word1, word2)
    return word1.length - len + word2.length - len
}

/**
 * Longest Common Subsequence （ LCS ）
 * 最長共同子序列
 * */
private fun lcs(word1: String, word2: String): Int {
    val dp = Array(word1.length + 1) { IntArray(word2.length + 1) { 0 } }
    for (i in word1.indices)
        for (j in word2.indices) {
            if (word1[i] == word2[j])
                dp[i + 1][j + 1] = dp[i][j] + 1
            else
                dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j])
        }
    return dp[word1.length][word2.length]
}