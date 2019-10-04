package creational.factory

// Crate a Factory to generate object of concrete class based on given information
object ShapeFactory {
    // use getShape method to get object of type shape
    fun getShape(shapeType: ShapeType): Shape {
        return when (shapeType) {
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.SQUARE -> Square()
            ShapeType.CIRCLE -> Circle()
        }
    }
}

enum class ShapeType {
    RECTANGLE, SQUARE, CIRCLE
}