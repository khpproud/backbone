package creational.factory.abstractfactory

import creational.factory.ShapeType

fun main() {
    var factory = FactoryProducer.getFactory(false)
    val rectangle = factory.getShape(ShapeType.RECTANGLE)
    val square = factory.getShape(ShapeType.SQUARE)

    factory = FactoryProducer.getFactory(true)
    val roundedRectangle = factory.getShape(ShapeType.RECTANGLE)
    val roundedSquare = factory.getShape(ShapeType.SQUARE)

    rectangle.draw()
    roundedRectangle.draw()
    square.draw()
    roundedSquare.draw()
}