package creational.builder.item.burger

class VegBurger : Burger() {
    override fun price(): Float = 25f

    override fun name(): String = "Veg Burger"
}