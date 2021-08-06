package tree

import model.Node

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * */

//Runtime: 216 ms, faster than 86.67% of Kotlin online submissions for N-ary Tree Preorder Traversal.
//Memory Usage: 38.6 MB, less than 73.33% of Kotlin online submissions for N-ary Tree Preorder Traversal.
fun preorder(root: Node?): List<Int> {
    fun traversal(node: Node, list: MutableList<Int>) {
        list.add(node.`val`)
        node.children.forEach { child ->
            child?.let {
                traversal(it, list)
            }
        }
    }

    val ans = mutableListOf<Int>()
    root?.let { traversal(it, ans) }
    return ans
}