package creational.factory.abstractfactory

// Create a Factory generator/producer object to get factories by passing an information such as Shape
object FactoryProducer {
    fun getFactory(rounded: Boolean): AbstractFactory {
        return if (rounded) {
            RoundedShapeFactory
        } else {
            ShapeFactory
        }
    }
}