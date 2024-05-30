class HashTable<T : Any> {

    var table = mutableListOf<MutableList<MutableList<Any>>>(
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf(),
        mutableListOf()
    );

    var limit = 6


    public fun hash(key: String): Int {
        var hash = 0;
        for (i in 0..key.length -1) {
            hash += (hash + key.get(i).code * 23)
        };
        return hash  % limit
    }

    public fun set(key: String, value: T): MutableList<MutableList<MutableList<Any>>>{
        val index = hash(key)

        table[index].add(mutableListOf(key, value))
        return table
    }


    public fun item(key: String): Any? {
        var index = hash(key)
        if (index > limit ){
            return null
        }
        val elements = table[index]
        val result =  elements.filter { el -> el[0] == key}
        if (result.size > 0){
            return result[0][1]
        }
        return  null

    }

}


