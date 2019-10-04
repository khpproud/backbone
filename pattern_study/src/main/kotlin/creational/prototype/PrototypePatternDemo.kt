package creational.prototype

fun main() {
    // Use ShapeCache class to get clones od shapes stored in a Hashtable.
    ShapeCache.loadCache()

    val clonedShape1 = ShapeCache.getShape("1")
    val clonedShape2 = ShapeCache.getShape("2")

    println("Shape1: ${clonedShape1.type}")
    println("Shape2: ${clonedShape2.type}")
}