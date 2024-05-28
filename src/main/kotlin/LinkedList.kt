import java.lang.IndexOutOfBoundsException

class LinkedListNode<T> (var value:T, var next:LinkedListNode<T>? = null) {
    override fun toString(): String {
        var result = "{ value:$value, "
        var node = this;

        println("{ value:$value, next:$next}")

        return  "{ value:$value, next:$next } "
    }
}
class LinkedList<T>  {

    public  var head:LinkedListNode<T>? = null;
    public var size:Int = 0;


    private fun checkIndex (index:Int) {
        if (index < 0 || index > size  ){
            throw IndexOutOfBoundsException()
        }
    }
    public fun append(value:T) {
        var newNode = LinkedListNode(value)
        if (head == null) {
            head = newNode
        } else {
            var currentNode = head
            while (currentNode!!.next != null) {

                currentNode = currentNode.next
            }
            currentNode.next = newNode


        }

        size += 1
    }

    public fun preppend(value: T) {
        var newNode = LinkedListNode<T>(value=value, next = head)
        head = newNode
        size += 1
    }



    public fun insert(value: T, index:Int) {
        checkIndex(index)

        var currentNode = head

        for (i in 0 .. index - 2) {
            if (currentNode == null) {
                throw  IndexOutOfBoundsException()
            }
            currentNode = currentNode.next
        }

        currentNode!!.next = LinkedListNode(value, currentNode.next)
        size += 1
    }

    public fun remove(index:Int){
        checkIndex(index)

        var currentNode = head


        for ( i in 0..index - 2 ){
            if (currentNode == null) {
                throw  IndexOutOfBoundsException()
            }
            currentNode = currentNode.next
        }

        currentNode!!.next = currentNode!!.next!!.next // currentNode!!.next is now skipped

    }

    public fun find(index:Int):T {
        checkIndex(index)
        var currentNode = head


        for ( i in 0..index - 1 ){
            if (currentNode == null) {
                throw  IndexOutOfBoundsException()
            }
            currentNode = currentNode.next
        }

        return currentNode!!.value
    }

}








