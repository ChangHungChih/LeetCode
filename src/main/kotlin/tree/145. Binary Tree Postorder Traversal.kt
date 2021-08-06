package tree

import model.TreeNode

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * */

//Runtime: 172 ms, faster than 32.23% of Kotlin online submissions for Binary Tree Postorder Traversal.
//Memory Usage: 35.8 MB, less than 23.14% of Kotlin online submissions for Binary Tree Postorder Traversal.
fun postorderTraversal(root: TreeNode?, list: MutableList<Int> = mutableListOf()): List<Int> {
    if (root == null) return emptyList()
    postorderTraversal(root.left, list)
    postorderTraversal(root.right, list)
    list.add(root.`val`)
    return list
}