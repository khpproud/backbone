package creational.builder.item.burger

import creational.builder.item.Item
import creational.builder.item.packing.Packing
import creational.builder.item.packing.Wrapper

abstract class Burger : Item {
    override fun packing(): Packing {
        return Wrapper()
    }

    abstract override fun price(): Float
}