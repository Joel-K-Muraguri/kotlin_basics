package linkedlist

class LinkedList<T> {

    var head : Node<T> ?= null
    var tail : Node<T> ?= null
    var size : Int = 0

    private fun isEmpty() : Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()){
            "Empty List"
        } else{
           head.toString()
        }
    }

    fun push(value : T){
        head   = Node(value = value,next = head)
        if (tail == null){
            tail = head
        }
        size++
    }

}