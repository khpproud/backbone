package creational.builder.item.drink

class Coke : ColdDrink() {
    override fun price(): Float = 30.0f

    override fun name(): String = "Coke"
}