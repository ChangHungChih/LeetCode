import model.TreeNode

/**
 * https://leetcode.com/problems/add-one-row-to-tree/
 * */

//Runtime: 192 ms, faster than 66.67% of Kotlin online submissions for Add One Row to Tree.
//Memory Usage: 36.3 MB, less than 100.00% of Kotlin online submissions for Add One Row to Tree.
fun addOneRow(root: TreeNode?, v: Int, d: Int): TreeNode? {
    if (d == 1) {
        return TreeNode(v).apply {
            left = root
        }
    }
    addNode(root, v, d)
    return root
}

fun addNode(root: TreeNode?, v: Int, d: Int, isLeft: Boolean = true) {
    root?.apply {
        if (d == 2) {
            root.left = TreeNode(v).apply {
                left = root.left
            }
            root.right = TreeNode(v).apply {
                right = root.right
            }
        } else {
            addNode(root.left, v, d - 1)
            addNode(root.right, v, d - 1, false)
        }
    }
}