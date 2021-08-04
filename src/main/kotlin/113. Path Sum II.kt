import model.TreeNode

/**
 * https://leetcode.com/problems/path-sum-ii/
 * */

fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    backtrack(root, targetSum, ans, mutableListOf())
    return ans
}

//Runtime: 204 ms, faster than 88.00% of Kotlin online submissions for Path Sum II.
//Memory Usage: 39.6 MB, less than 56.00% of Kotlin online submissions for Path Sum II.
fun backtrack(node: TreeNode?, targetSum: Int, ans: MutableList<List<Int>>, currentList: MutableList<Int>) {
    if (node == null) return
    currentList.add(node.`val`)
    if (targetSum - node.`val` == 0 && node.left == null && node.right == null) {
        ans.add(currentList.toList())
    }

    backtrack(node.left, targetSum - node.`val`, ans, currentList)
    backtrack(node.right, targetSum - node.`val`, ans, currentList)

    currentList.removeLast()
//    currentList.removeAt(currentList.size - 1)
}