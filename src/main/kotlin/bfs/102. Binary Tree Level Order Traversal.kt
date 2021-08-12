package bfs

import model.TreeNode
import java.util.*

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * */

//Runtime: 184 ms, faster than 86.27% of Kotlin online submissions for Binary Tree Level Order Traversal.
//Memory Usage: 36.3 MB, less than 14.71% of Kotlin online submissions for Binary Tree Level Order Traversal.
fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()
    val ans = mutableListOf<List<Int>>()
    val queue = LinkedList<TreeNode>()
    queue.offer(root)
    while (queue.isNotEmpty()) {
        val len = queue.size
        val list = mutableListOf<Int>()
        repeat(len) {
            val node = queue.poll()
            list.add(node.`val`)
            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }
        ans.add(list)
    }

    return ans
}