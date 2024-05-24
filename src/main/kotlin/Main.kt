fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var newStack = Stack<Int>(1,2,2,4,5);
    var newQueue = Queue<String>("first order", "second order", "3rd order");
    var newTree = BinarySearchTree()

    newTree.add(6)
    newTree.add(2)
    newTree.add(5)
    newTree.add(7)
    newTree.add(4)
    newTree.add(8)
    newTree.add(1)

    println(newTree.max())
    println(newTree.min())
    println(newTree.exists(4))
    println(newTree.exists(678))




}

