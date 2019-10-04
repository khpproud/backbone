package creational.factory.abstractfactory

import creational.factory.Shape

class RoundedRectangle : Shape {
    override fun draw() {
        println("Inside RoundedRectangle::draw() method.")
    }
}