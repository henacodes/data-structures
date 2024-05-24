import kotlin.math.ceil

class Node(
    val data: Int,
    var left: Node? = null,
    var right: Node? = null,


){
    override fun toString(): String {
        return "{ data:$data, " +
                " left:$left" +
                " right:$right" +
                "}"
    }
}

class BinarySearchTree(var root:Node? = null ) {


    private fun searchTree(node: Node, data: Int) {
        if (data < node.data) {
            if (node.left == null) {
                node.left = Node(data = data);
                return
            } else {
                return searchTree(node.left!!, data)
            }
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = Node(data = data)
            } else {
                return searchTree(node.right!!, data)
            }
        } else {
            return
        }
    }

    public fun add(data: Int) {
        if (root == null) {
            root = Node(data = data)

        } else {
            searchTree(root!!, data)
        }
    }
    public fun max ():Int? {
        var result:Node? = root
        while (result?.right != null) {
            result = result?.right
        }
        return result?.data
    }

    public fun exists (num:Int, tree:Node? = root) :Boolean?{
        if (tree==null) {
            return false
        };
        if (num < tree?.data!!) {
            return exists(num, tree?.left)
        } else if (num > tree?.data!!){
            return exists(num, tree?.right)
        } else {
            return true
        }
    }


    public fun min ():Int? {
        var result:Node? = root
        while (result?.left != null) {
            result = result?.left
        }
        return result?.data
    }




    override fun toString(): String {
        return "tree $root, "
    }

}