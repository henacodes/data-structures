class Stack<T> (vararg val initialItems:T   )  {
    private var count = 0;
    private  val items = HashMap<Int, T> ();

    init {
        for (i in initialItems.indices){
            items[i] = initialItems[i];
            count += 1;
        }
    }

    public fun length () :Int{
        return items.size
    }

    // added new item and returns the new array
    public fun push (item:T){
        items[count] = item;
        count += 1;
    }

    public fun pop () : T?{
        var item = items[count - 1]

        count -= 1
        return item;
    }


    // returns the stack  as an array
    public fun values ():MutableList<T>{
        var result = mutableListOf<T>();

        for (key in items.keys){
            result.add(items[key]!!);
        }
        return result;

    }

    // the string representation of the stack
    override fun toString():String {
        var list = values()
        return list.toString()

    }


}