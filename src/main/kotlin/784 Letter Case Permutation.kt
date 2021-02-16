fun main() {
    val s = "a1b2"
    println(letterCasePermutation(s))
}

fun letterCasePermutation(S: String): List<String> {
    if (S.isNullOrEmpty()){
        return emptyList()
    }
    val ansList = mutableListOf<String>()
    addString(S, ansList, 0)
    return ansList
}

fun addString(str: String, list: MutableList<String>, index: Int) {
    when {
        index == str.length -> {
            list.add(str)
        }
        str[index].isLetter() -> {
            if (str[index].isUpperCase()) {
                addString(
                    str.replaceRange(index, index + 1, str[index].toLowerCase().toString()),
                    list,
                    index + 1
                )
            } else {
                addString(
                    str.replaceRange(index, index + 1, str[index].toUpperCase().toString()),
                    list,
                    index + 1
                )
            }
            addString(str, list, index + 1)
        }
        else -> {
            addString(str, list, index + 1)
        }
    }
}


/**
Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.

Return a list of all possible strings we could create. You can return the output in any order.

Example 1:

Input: S = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]
Example 2:

Input: S = "3z4"
Output: ["3z4","3Z4"]
Example 3:

Input: S = "12345"
Output: ["12345"]
 * */
