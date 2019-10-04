package creational.builder.item.drink

class Pepsi : ColdDrink() {
    override fun price(): Float = 35f

    override fun name(): String = "Pepsi"
}