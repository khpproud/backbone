package creational.factory

fun main() {
    val rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE)
    val square = ShapeFactory.getShape(ShapeType.SQUARE)
    val circle = ShapeFactory.getShape(ShapeType.CIRCLE)

    rectangle.draw()
    square.draw()
    circle.draw()
}