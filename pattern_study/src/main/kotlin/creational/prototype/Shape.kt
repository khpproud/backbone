package creational.prototype

// Create an abstract class implementing Cloneable interface
abstract class Shape(open var id: String,
                     val type: String) : Cloneable {

    abstract fun draw()

    /**
     * Other classes can use clone() possibly,
     * "public" qualifier should be inserted.
     */
    public override fun clone(): Any {
        return super.clone()
    }
}