package model

data class Node(var `val`: Int){
    var children: List<Node?> = listOf()
}
