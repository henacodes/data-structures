public class  Queue<T> (vararg val initialItems:T   )  {
   private  val items = mutableListOf<T>(*initialItems)


    public fun enqueue(item:T):T{
        items.add(item)
        return item
    }
    public fun dequeue() :T?{
        var result =  items[0]
        items.removeAt(0)
        return result

    }

    public fun peek() : T?{
        return items[0]
    }
    public fun isEmpty():Boolean {
        return items.isEmpty()
    }
    public fun length():Int {
        return items.size;
    }

}