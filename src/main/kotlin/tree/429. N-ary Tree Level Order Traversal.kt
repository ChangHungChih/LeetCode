package tree

import model.Node

/**
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * */

//Runtime: 236 ms, faster than 50.00% of Kotlin online submissions for N-ary Tree Level Order Traversal.
//Memory Usage: 39.4 MB, less than 50.00% of Kotlin online submissions for N-ary Tree Level Order Traversal.
fun levelOrder(root: Node?): List<List<Int>> {
    fun bfs(node: Node, ans: MutableList<MutableList<Int>>, level: Int) {
        if (ans.size < level + 1) {
            ans.add(mutableListOf())
        }
        val childrenList = ans[level]
        node.children.forEach {
            it?.apply {
                childrenList.add(`val`)
                bfs(this, ans, level + 1)
            }
        }
        if (ans[level].isEmpty()) ans.removeAt(level)
    }

    val ans = mutableListOf<MutableList<Int>>()
    root?.let {
        ans.add(mutableListOf(root.`val`))
        bfs(it, ans, 1)
    }
    return ans
}