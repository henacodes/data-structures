fun main(args: Array<String>) {


    val table = HashTable<Int>()

    table.set("washers", 50)
    table.set("lumber", 21320)
    table.set("anthropic", 3242)
    table.set("harmony", 5389)
    println(table.table)

    //println(table.hash("washers"))
    //println(table.hash("lumber"))

    println(table.item("lumber"))
    println(table.item("anthropic"))



}

