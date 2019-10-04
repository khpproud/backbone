package creational.factory.abstractfactory

import creational.factory.*

// Create Factory classes extending AbstractFactory to generate object of concrete class based on given information
object RoundedShapeFactory : AbstractFactory() {
    override fun getShape(shapeType: ShapeType): Shape {
        return when (shapeType) {
            ShapeType.RECTANGLE -> RoundedRectangle()
            ShapeType.SQUARE -> RoundedSquare()
            ShapeType.CIRCLE -> Circle()
        }
    }
}