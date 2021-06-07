package needToStudy.dp

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * */

fun main() {
    val arr = intArrayOf(
        1, 100, 1, 1, 1, 100, 1, 1, 100, 1
    )
    println(minCostClimbingStairs(arr))
}

fun minCostClimbingStairs(cost: IntArray): Int {
    val size = cost.size
    cost.reduceIndexed { index, acc, i ->
        if (index < 2){
            i
        }else{
            cost[index] += minOf(cost[index - 2], cost[index - 1])
            cost[index]
        }
    }

    return minOf(cost[size - 1], cost[size - 2])
}