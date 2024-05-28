fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var newStack = Stack<Int>(1,2,2,4,5);
    var newQueue = Queue<String>("first order", "second order", "3rd order");
    var newTree = BinarySearchTree()



    var newList = LinkedList<Int>()

    newList.append(3);
    newList.append(4);

    newList.insert(78, 1)
    println(newList.head!!.next!!.value)
    println(newList.head!!.next!!.next!!.value)
    println(newList.find(0))
    println(newList.find(1))
    println(newList.find(2))
    /*newList.append(5);
    newList.append(6);
    newList.append(7);
    println(newList.size)
    println(newList.head)*/








}

