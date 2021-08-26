package tree.needToStudy

/**
 * https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
 * */

fun main() {
    val s = "9,3,4,#,#,1,#,#,2,#,6,#,#"
    println(isValidSerialization(s))
}

fun isValidSerialization(preorder: String): Boolean {
    val arr = preorder.split(',')
    var end = 1
    arr.forEach {
        if (--end < 0) return false
        if (it != "#") {
            end += 2
        }
    }

    return end == 0
}