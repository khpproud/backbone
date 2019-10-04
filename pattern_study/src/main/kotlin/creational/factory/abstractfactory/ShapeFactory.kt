package creational.factory.abstractfactory

import creational.factory.*

object ShapeFactory : AbstractFactory() {
    // use getShape method to get object of type shape
    override fun getShape(shapeType: ShapeType): Shape {
        return when (shapeType) {
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.SQUARE -> Square()
            ShapeType.CIRCLE -> Circle()
        }
    }
}