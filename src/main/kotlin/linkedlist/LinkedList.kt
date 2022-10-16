package linkedlist

class LinkedList<T> {

    var head : Node<T> ?= null
    private var tail : Node<T> ?= null
    private var size : Int = 0

    private fun isEmpty() : Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()){
            "Empty List"
        } else{
           head.toString()
        }
    }

    fun push(value : T) : LinkedList<T> = apply{
        head  = Node(value = value,next = head)
        if (tail == null){
            tail = head
        }
        size++
    }

    fun append(value: T) : LinkedList<T> = apply {
        if (isEmpty()){
            push(value)
            return this
        }

        val newNode = Node(value = value)
        tail?.next = newNode

        tail = newNode
    }

    fun nodeAt(index : Int) : Node<T> ? {
        var currentNode = head
        var currentIndex = 0
        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }


    fun insert(value: T, afterNode : Node<T>?) : Node<T>{
        if (tail == afterNode){
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next = afterNode?.next)

        afterNode?.next = newNode
        size++

        return newNode
    }
}