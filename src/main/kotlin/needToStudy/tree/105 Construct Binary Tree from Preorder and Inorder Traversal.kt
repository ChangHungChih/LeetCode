package needToStudy.tree

import model.TreeNode

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * */

fun main() {
    val preorder = intArrayOf(
        3, 9, 20, 15, 7
    )
    val inorder = intArrayOf(
        9, 3, 15, 20, 7
    )
    val treeNode = buildTree(preorder, inorder)
    println(treeNode)
}

fun buildTree(
    preorder: IntArray,
    inorder: IntArray,
    preIndex: Int = 0,
    inIndex: Int = 0,
    size: Int = preorder.size
): TreeNode? {
    if (size <= 0) return null
    val midIndex = inorder.indexOf(preorder[preIndex])
    val root = TreeNode(preorder[preIndex])
    val leftSize = midIndex - inIndex
    root.left = buildTree(preorder, inorder, preIndex + 1, inIndex, leftSize)
    root.right = buildTree(preorder, inorder, preIndex + leftSize + 1, midIndex + 1, size - leftSize - 1)
    return root
}