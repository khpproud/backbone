package creational.prototype

import java.util.*

// Create a class to get concrete classes from heavily ex database and store them in a Hashtable.
object ShapeCache {
    private val shapeMap: Hashtable<String, Shape> = Hashtable()

    fun getShape(shapeId: String): Shape {
        val cacheShape: Shape = shapeMap[shapeId]!!
        return cacheShape.clone() as Shape
    }

    /**
     * For each shape run database query and create shape
     * shapeMap.put(shapeKey, shape)
     * for example, we are adding two shapes
     */
    fun loadCache() {
        val circle = Circle("1")
        shapeMap[circle.id] = circle

        val rectangle = Rectangle("2")
        shapeMap[rectangle.id] = rectangle
    }
}