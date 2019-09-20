package builder.item.burger

class ChickenBurger : Burger() {
    override fun price(): Float = 50.5f

    override fun name(): String = "Chicken Burger"
}