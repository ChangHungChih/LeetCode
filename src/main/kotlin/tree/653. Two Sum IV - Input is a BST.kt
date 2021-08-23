package tree

import model.TreeNode

/**
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 * */

//Runtime: 236 ms, faster than 48.00% of Kotlin online submissions for Two Sum IV - Input is a BST.
//Memory Usage: 39.8 MB, less than 50.00% of Kotlin online submissions for Two Sum IV - Input is a BST.
fun findTarget(root: TreeNode?, k: Int): Boolean {
    val valueSet = mutableSetOf<Int>()
    var ans = false
    fun travel(node: TreeNode?) {
        if (ans || node == null) return
        if (valueSet.contains(k - node.`val`)) {
            ans = true
            return
        }
        valueSet.add(node.`val`)
        travel(node.left)
        travel(node.right)
    }
    travel(root)
    return ans
}