/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * */

//Runtime: 256 ms, faster than 21.83% of Kotlin online submissions for Intersection of Two Linked Lists.
//Memory Usage: 37.9 MB, less than 92.25% of Kotlin online submissions for Intersection of Two Linked Lists.
fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    var a = headA
    var b = headB

    while (a != b) {
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }
    return a
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
