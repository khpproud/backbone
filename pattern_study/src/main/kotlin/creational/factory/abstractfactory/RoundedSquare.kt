package creational.factory.abstractfactory

import creational.factory.Shape

class RoundedSquare : Shape {
    override fun draw() {
        println("Inside RoundedSquare::draw() method.")
    }
}