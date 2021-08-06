package tree

import model.TreeNode

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * */

//Runtime: 160 ms, faster than 56.63% of Kotlin online submissions for Binary Tree Preorder Traversal.
//Memory Usage: 35.9 MB, less than 14.46% of Kotlin online submissions for Binary Tree Preorder Traversal.
fun preorderTraversal(root: TreeNode?, list: MutableList<Int> = mutableListOf()): List<Int> {
    if (root == null) return emptyList()
    list.add(root.`val`)
    preorderTraversal(root.left, list)
    preorderTraversal(root.right, list)
    return list
}