fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var newStack = Stack<Int>(1,2,2,4,5);
    var newQueue = Queue<String>("first order", "second order", "3rd order");
    println(newQueue.peek())
    println(newQueue.dequeue())
    println(newQueue.enqueue("another one interupted"))
    println(newQueue.peek())
    println(newQueue.length())



}

