package creational.builder.item.drink

import creational.builder.item.Item
import creational.builder.item.packing.Bottle
import creational.builder.item.packing.Packing

abstract class ColdDrink : Item {
    override fun packing(): Packing {
        return Bottle()
    }

    abstract override fun price(): Float
}