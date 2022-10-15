package linkedlist

fun main(){

    val list = Node(value = 1, next = Node(value = 2, next = Node(value = 3, next = Node(value = 4, next = Node(value = 5)))))



    pushExample()
}

fun pushExample(){

    val list = LinkedList<Int>()

    list.push(3)
    list.push(10)
    list.push(748)
    list.push(4894)

    println(list)
}