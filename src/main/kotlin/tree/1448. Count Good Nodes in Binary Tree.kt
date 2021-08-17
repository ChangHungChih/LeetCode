package tree

import model.TreeNode

/**
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * */

//Runtime: 324 ms, faster than 90.63% of Kotlin online submissions for Count Good Nodes in Binary Tree.
//Memory Usage: 47 MB, less than 65.63% of Kotlin online submissions for Count Good Nodes in Binary Tree.
fun goodNodes(root: TreeNode?): Int {
    var ans = 0
    fun backtracking(node: TreeNode?, maxValue: Int) {
        node?.apply {
            if (`val` >= maxValue) {
                ans++
            }
            backtracking(node.left, maxOf(node.`val`, maxValue))
            backtracking(node.right, maxOf(node.`val`, maxValue))
        }
    }

    backtracking(root, root?.`val` ?: 0)
    return ans
}