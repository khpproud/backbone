package creational.factory.abstractfactory

import creational.factory.Shape
import creational.factory.ShapeType

// Crates an Abstract class to get factories fro Normal and Rounded shape objects.
abstract class AbstractFactory {
    abstract fun getShape(shapeType: ShapeType): Shape
}