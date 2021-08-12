package bfs

import model.TreeNode
import java.util.*

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * */

//Runtime: 480 ms, faster than 18.82% of Kotlin online submissions for Minimum Depth of Binary Tree.
//Memory Usage: 54 MB, less than 62.35% of Kotlin online submissions for Minimum Depth of Binary Tree.
fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0
    var depth = 1
    val queue: Queue<TreeNode> = LinkedList()
    queue.offer(root)
    while (queue.isNotEmpty()) {
        val len = queue.size
        (1..len).forEach { _ ->
            val node = queue.poll()
            if (node.left == null && node.right == null) {
                return depth
            }
            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }
        depth++
    }
    return depth
}