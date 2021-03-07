/**
 * https://leetcode.com/problems/design-hashmap/
 * */

fun main() {
    val hashMap = MyHashMap()
    hashMap.put(1, 1)
    hashMap.put(2, 2)
    println(hashMap.get(1))            // returns 1
    println(hashMap.get(3))            // returns -1 (not found)
    hashMap.put(2, 1)          // update the existing value
    println(hashMap.get(2))            // returns 1
    hashMap.remove(2)          // remove the mapping for 2
    println(hashMap.get(2))         // returns -1 (not found)
}

//Runtime: 428 ms, faster than 53.66% of Kotlin online submissions for Design HashMap.
//Memory Usage: 60.2 MB, less than 29.27% of Kotlin online submissions for Design HashMap.
class MyHashMap() {

    /** Initialize your data structure here. */
    private var list = IntArray(0)

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        if (list.size <= key + 1) {
            list = IntArray(key + 1) { -1 }.apply {
                list.forEachIndexed { index, i ->
                    this[index] = i
                }
            }
        }
        list[key] = value
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        return list.getOrNull(key) ?: -1
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        if (list.size > key) {
            list[key] = -1
        }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */