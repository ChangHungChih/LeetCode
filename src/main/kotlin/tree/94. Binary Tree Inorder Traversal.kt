package tree

import model.TreeNode

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * */

//Runtime: 156 ms, faster than 71.00% of Kotlin online submissions for Binary Tree Inorder Traversal.
//Memory Usage: 34 MB, less than 83.99% of Kotlin online submissions for Binary Tree Inorder Traversal.
fun inorderTraversal(root: TreeNode?, list: MutableList<Int> = mutableListOf()): List<Int> {
    if (root == null) return emptyList()
    inorderTraversal(root.left, list)
    list.add(root.`val`)
    inorderTraversal(root.right, list)
    return list
}