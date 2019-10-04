package creational.prototype

class Circle(
    override var id: String = "",
    type: String = "Circle") : Shape(id, type) {

    override fun draw() {
        println("Inside Circle::draw() method.")
    }
}