package linkedlist

fun main(){

    val list = Node(value = 1, next = Node(value = 2, next = Node(value = 3, next = Node(value = 4, next = Node(value = 5)))))


   insertExample()
}

fun pushExample(){

    val list = LinkedList<Int>()

    list
        .push(345)
        .push(3)
    .push(10)
    .push(748)
    .push(4894)

    println(list)
}

fun appendExample(){
    val list = LinkedList<String>()

    list.append("Joel").append("Kariuki").append("Muraguri")
    println(list)
}

fun insertExample(){
    val list = LinkedList<Int>()


    list.push(2).push(3).push(4).push(5)
    println("Before inserting :  $list")

    var middleNode = list.nodeAt(1)
    for (i in 2..5){
        middleNode = list.insert(-1 * 1, middleNode)
    }

    println("After inserting : $list")
}