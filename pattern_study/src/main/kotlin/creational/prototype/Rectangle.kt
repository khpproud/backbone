package creational.prototype

// Create concrete classes extending the Shape class
class Rectangle(
    override var id: String = "",
    type: String = "Rectangle") : Shape(id, type) {
    override fun draw() {
        println("Inside Rectangle::draw() method.")
    }
}