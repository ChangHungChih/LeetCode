package tree

import model.Node

/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * */

//Runtime: 228 ms, faster than 56.00% of Kotlin online submissions for N-ary Tree Postorder Traversal.
//Memory Usage: 38.9 MB, less than 60.00% of Kotlin online submissions for N-ary Tree Postorder Traversal.
fun postorder(root: Node?): List<Int> {
    fun traversal(node: Node, list: MutableList<Int>) {
        node.children.forEach { child ->
            child?.let {
                traversal(it, list)
            }
        }
        list.add(node.`val`)
    }

    val ans = mutableListOf<Int>()
    root?.let { traversal(it, ans) }
    return ans
}

