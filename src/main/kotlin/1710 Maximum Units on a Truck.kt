/**
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 * */

fun main() {
    val arr = arrayOf(
//        intArrayOf(1, 3),
//        intArrayOf(2, 2),
//        intArrayOf(3, 1),
        intArrayOf(5, 10),
        intArrayOf(2, 5),
        intArrayOf(4, 7),
        intArrayOf(3, 9),
    )
    val truckSize = 10

    println(maximumUnits(arr, truckSize))
}

//Runtime: 260 ms, faster than 39.58% of Kotlin online submissions for Maximum Units on a Truck.
//Memory Usage: 44 MB, less than 39.58% of Kotlin online submissions for Maximum Units on a Truck.
fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
    var size = 0
    var ans = 0
    val sortedTypes = boxTypes.sortedBy { it[1] }.reversed()
    sortedTypes.forEach {
        if (size < truckSize) {
            val boxNumber = if (it[0] <= truckSize - size) {
                it[0]
            } else {
                truckSize - size
            }
            ans += boxNumber * it[1]
            size += boxNumber
        } else {
            return ans
        }
    }
    return ans
}