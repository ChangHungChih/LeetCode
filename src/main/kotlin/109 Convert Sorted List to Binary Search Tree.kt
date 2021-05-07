import model.ListNode
import model.TreeNode

/**
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 * */

fun sortedListToBST(head: ListNode?): TreeNode? {
    val nums = head?.toArrayList() ?: return null
    fun recur(lo: Int = 0, hi: Int = nums.lastIndex, mid: Int = (lo + hi) / 2): TreeNode? =
        if (lo > hi) null else TreeNode(nums[mid]).apply {
            left = recur(lo, mid - 1)
            right = recur(mid + 1, hi)
        }
    return recur()
}

fun ListNode.toArrayList(list:ArrayList<Int> = ArrayList()): ArrayList<Int> {
    list.add(`val`)
    return next?.toArrayList(list) ?: list
}