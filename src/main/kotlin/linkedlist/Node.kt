package linkedlist

data class Node<T>(
    val value : T,
    val next : Node<T> ? = null
) {

    override fun toString(): String {
        return if (next != null){
            "$value --> ${next.toString()} "
        }
        else{
            "$value"
        }
    }

    fun printReverse(){
        next?.printReverse()

        if (next != null){
            print(" --> ")
        }
        print(value.toString())
    }

}