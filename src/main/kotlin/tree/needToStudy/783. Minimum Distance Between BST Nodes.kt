package tree.needToStudy

import model.TreeNode

/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * */

fun minDiffInBST(root: TreeNode?): Int {
    var temp: Int? = null
    var ans = Int.MAX_VALUE
    fun traversal(node: TreeNode) {
        node.left?.let { traversal(it) }
        temp?.let { ans = ans.coerceAtMost(node.`val` - it) }
        temp = node.`val`
        node.right?.let { traversal(it) }
    }

    root?.let { traversal(it) }
    return ans
}